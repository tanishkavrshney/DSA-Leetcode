class Solution {
    public long countSubarrays(int[] nums, int k) {
        int maxele = maxOfArray(nums);
        long res=0;
        long count=0;
        int left=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]==maxele){
                count++;
            }
            while(count>=k){
                if(nums[left]==maxele){
                    count--;
                }
                left++;
            }
            res+=left;
        }
        return res;
    }
    public int maxOfArray(int[] nums){
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        return max;
    }
}

// class Solution {
//     public long countSubarrays(int[] nums, int k) {
//         int max = Integer.MIN_VALUE;
//         for (int num : nums) {
//             max = Math.max(max, num);
//         }

//         long res = 0;
//         int count = 0;
//         int left = 0;

//         for (int right = 0; right < nums.length; right++) {
//             if (nums[right] == max) {
//                 count++;
//             }

//             while (count >= k) {
//                 if (nums[left] == max) {
//                     count--;
//                 }
//                 left++;
//             }

//             res += left;
//         }

//         return res;
//     }
// }
