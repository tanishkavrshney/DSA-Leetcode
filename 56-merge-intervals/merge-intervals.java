class Solution {
    public int[][] merge(int[][] arr) {
        List<int[]> merged = new ArrayList<>();
        if(arr.length==0 || arr==null)  return merged.toArray(new int[0][]);

        Arrays.sort(arr,(a,b) -> a[0]-b[0]);

        int start = arr[0][0];
        int end = arr[0][1];
        for(int[] i : arr){
            if(i[0]<=end){
                end=Math.max(i[1],end);
            }
            else{
                merged.add(new int[]{start,end});
                start=i[0];
                end=i[1];
            }
        }
        merged.add(new int[]{start,end});
        return merged.toArray(new int[0][]);

    }
}