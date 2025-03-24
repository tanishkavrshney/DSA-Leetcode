/*import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum<0){
                    j++;
                }
                else if(sum>0){
                    k--;
                }
                else{
                    ans.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j+1]) j++;
                    while(j<k && nums[k]==nums[k-1]) k--;
                }
            }
        }
        return ans;
    }
}*/

import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums); // Sorting is necessary

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // Skip duplicate elements for i

            int j = i + 1, k = nums.length - 1; // Two-pointer approach

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if (sum < 0) {
                    j++; // Increase j to get a larger sum
                } else if (sum > 0) {
                    k--; // Decrease k to get a smaller sum
                } else {
                    // Found a valid triplet
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));

                    // **Fix: Move pointers first before checking duplicates**
                    j++;
                    k--;

                    // Skip duplicates for j
                    while (j < k && nums[j] == nums[j - 1]) j++; 
                    // Skip duplicates for k
                    while (j < k && nums[k] == nums[k + 1]) k--; 
                }
            }
        }
        return ans;
    }
}
