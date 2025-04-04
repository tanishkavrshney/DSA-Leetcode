class Solution {
    public int majorityElement(int[] nums) {
        int c=0;
        int el = nums[0];
        for(int i=0;i<nums.length;i++){
            if(c==0){
                el = nums[i];
                c=1;
            }
            else if(nums[i]==el){
                c++;
            }
            else{
                c--;
            }
        }
        int c1=0;
        for(int i=0; i<nums.length;i++){
            if(nums[i]==el){
                c1++;
            }
        }
        if(c1>(nums.length/2)){
            return el;
        }
        return -1;
    }
}