// https://leetcode.com/problems/set-matrix-zeroes/

class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> row=new HashSet<>();
        HashSet<Integer> column=new HashSet<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    row.add(i);
                    column.add(j);
                }

            }
        }
        for(int num:row){
            for(int j=0;j<matrix[0].length;j++){
                matrix[num][j]=0;
            }
        }
        for(int num:column){
            for(int i=0;i<matrix.length;i++){
                matrix[i][num]=0;
            }
        }
    }
}
