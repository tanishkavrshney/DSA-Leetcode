class Solution {
    public int numRabbits(int[] answers) {
        Map<Integer,Integer> mp=new HashMap<>();
        int result=0;

        for(int ans:answers){
            mp.put(ans,mp.getOrDefault(ans,0)+1);
        }

        for(int x:mp.keySet()){
            int freq=mp.get(x);
            int groupSize=x+1;
            int totalGrp=(freq+groupSize-1)/groupSize;
            result+=totalGrp*groupSize;
        }
        return result;
    }
}