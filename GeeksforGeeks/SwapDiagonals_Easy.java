// https://www.geeksforgeeks.org/problems/swap-major-and-minor-diagonals-of-a-square-matrix/1

class Solution {
    public void swapDiagonal(int[][] mat) {
        // code here
        for(int i=0;i<mat.length;i++){
            int temp=mat[i][i];
            mat[i][i]=mat[i][mat.length-i-1];
            mat[i][mat.length-i-1]=temp;
        }
        
        
    }
}
