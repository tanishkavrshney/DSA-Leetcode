class Solution {
    public int sumBase(int num, int k) {
        int sum=0;

        while (num > 0) {
            int rem = num % k;
            sum+=rem;
            num /= k;
        }

        return sum;

    }
}