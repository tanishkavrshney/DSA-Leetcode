class Solution {
    public int numberOfGoodSubarraySplits(int[] nums) {
        final int MOD = 1_000_000_007;
        int n = nums.length;
        long result = 1;

        int firstOne = -1;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                firstOne = i;
                break;
            }
        }

        if (firstOne == -1) return 0;
        for (int i = firstOne + 1; i < n; i++) {
            if (nums[i] == 1) {
                int gap = i - firstOne - 1;
                result = (result * (gap + 1)) % MOD;
                firstOne = i; 
            }
        }

        return (int) result;
    }
}
