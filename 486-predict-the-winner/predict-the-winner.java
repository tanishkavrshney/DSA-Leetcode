class Solution {
    public boolean predictTheWinner(int[] nums) {
        Integer[][] dp = new Integer[nums.length][nums.length];
        return helper(nums,0,nums.length-1,dp)>=0; 
    }
    public int helper(int[] nums,int i,int j,Integer[][]dp){
        if(i==j) return nums[i];
        if(dp[i][j]!= null) return dp[i][j];

        int pickleft = nums[i]-helper(nums,i+1,j,dp);
        int pickright =  nums[j]-helper(nums,i,j-1,dp);
        
        dp[i][j] = Math.max(pickright,pickleft);
        return dp[i][j];
    }
}