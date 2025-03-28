class Solution {
    public int[][] insert(int[][] arr, int[] newInterval) {
        List<int[]> res = new ArrayList<>();
        int i=0;
        while(i<arr.length && arr[i][1]< newInterval[0]){
            res.add(arr[i]);
            i++;
        }
        while(i<arr.length && arr[i][0]<=newInterval[1]){
            newInterval[0]=Math.min(newInterval[0],arr[i][0]);
            newInterval[1]=Math.max(newInterval[1],arr[i][1]);
            i++;
        }
        res.add(newInterval);
        while(i<arr.length){
            res.add(arr[i]);
            i++;
        }
        return res.toArray(new int[res.size()][]);
    }
}