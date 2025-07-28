// https://www.geeksforgeeks.org/problems/make-matrix-beautiful-1587115620/1

class Solution {
    public static int balanceSums(int[][] mat) {
        // code here
        int[] rowSum=new int[mat.length];
        int[] colSum=new int[mat.length];
        int maxSum=0,totalSum=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                rowSum[i]+=mat[i][j];
                colSum[j]+=mat[i][j];
                totalSum+=mat[i][j];
            }
        }
        for(int i=0;i<mat.length;i++){
            maxSum=Math.max(maxSum,rowSum[i]);
            maxSum=Math.max(maxSum,colSum[i]);
        }
        return (maxSum*mat.length)-totalSum;
    }
}
