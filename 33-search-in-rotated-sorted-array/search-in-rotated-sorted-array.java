class Solution {
    public int search(int[] nums, int target) {
        int low=0,high=nums.length-1,mid=0;
        while(low<=high){
            mid=low+(high-low)/2;
            if(target==nums[mid]) return mid;

            //left sorted
            if(nums[low]<=nums[mid]){
                if(nums[low]<=target && target<=nums[mid]) high=mid-1;
                else low=mid+1;
            }
            //right sorted
            else{
                if(nums[mid]<=target && target<=nums[high]) low=mid+1;
                else high=mid-1;
            }
        }
        return -1;
    }
}