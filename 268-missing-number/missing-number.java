class Solution {
    public int missingNumber(int[] nums) {
        // int max=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]>max){
        //         max=nums[i];
        //     }
        // }
        int[]hash=new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            hash[nums[i]]++;
        }
        int j=0;
        for(j=0;j<hash.length;j++){
            if(hash[j]<1){
                return j;
            }
        }
        return -1;
    }
}