class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            if (entry.getValue() > nums.length/3) {
                list.add(entry.getKey());
            }
        }
        return list;
    }
}