class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> result=new HashSet<>();
        int a=0;
        for(int i=0;i<nums1.length;i++){
            set1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(set1.contains(nums2[i])){
                result.add(nums2[i]);
            }
        }
        
        int arr[]=new int[result.size()];
        for(int i:result){
            arr[a++]=i;
        }
        return arr;
    }
}