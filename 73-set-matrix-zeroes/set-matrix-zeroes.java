class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        Set<Integer> zeroRows = new HashSet<>();
        Set<Integer> zeroCols = new HashSet<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    zeroRows.add(i);
                    zeroCols.add(j);
                }
            }
        }
        for(int row : zeroRows){
            for(int i=0;i<n;i++){
                matrix[row][i]=0;
            }
        }
        for(int cols : zeroCols){
            for(int i=0;i<m;i++){
                matrix[i][cols]=0;
            }
        }
        System.out.println(Arrays.deepToString(matrix).replace(" ", ""));
    }
}