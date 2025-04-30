class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int maxSum = sum;
        int left=0;
        for(int i=k;i<nums.length;i++){
            sum-=nums[left];
            sum+=nums[i];
            left++;
            maxSum=Math.max(sum,maxSum);
        }
        return (double)maxSum/k;
    }
}