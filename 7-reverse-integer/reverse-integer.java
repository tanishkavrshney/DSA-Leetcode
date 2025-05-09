class Solution {
    public int reverse(int x) {
        int r = 0;
        while (x != 0) {
            int s = x % 10;
            
            if (r > Integer.MAX_VALUE / 10 || (r == Integer.MAX_VALUE / 10 && s > 7)) return 0;
            if (r < Integer.MIN_VALUE / 10 || (r == Integer.MIN_VALUE / 10 && s < -8)) return 0;
            
            r = r * 10 + s;
            x /= 10;
        }
        return r;
    }
}
