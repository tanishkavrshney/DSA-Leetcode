class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(1,k,n,new ArrayList<>(),ans);
        return ans;
    }
    public void helper(int start,int k,int n, List<Integer> current, List<List<Integer>> result){
        if (current.size() == k && n == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        if(current.size()>k||n<0){
            return;
        }

        for(int i=start;i<=9;i++){
            current.add(i);
            helper(i+1,k,n-i,current,result);
            current.remove(current.size()-1);
        }
    }
}