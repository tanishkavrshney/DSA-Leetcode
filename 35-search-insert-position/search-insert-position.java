class Solution {
    public int searchInsert(int[] nums, int target) {
        int beg=0;
        int end=nums.length-1;
        int ans = nums.length;
        while(beg<=end){
            int mid = (beg+end)/2;
            if(target<=nums[mid]){
                ans=mid;
                end=mid-1;
            }
            else{
                beg = mid+1;
            }
        }
        return ans;
    }
}