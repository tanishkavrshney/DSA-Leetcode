class Solution {
    public boolean isPerfectSquare(int num) {
        int x = (int)Math.sqrt(num);
        return x*x == num;
    }
}