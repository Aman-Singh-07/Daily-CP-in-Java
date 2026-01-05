// https://leetcode.com/problems/maximum-matrix-sum/?envType=daily-question&envId=2026-01-05

class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long sum=0;
        int min=Integer.MAX_VALUE;
        int count=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                int x=matrix[i][j];
                if(x<0){
                    count++;
                    x=-x;
                    sum+=x;
                }
                else sum+=x;
                min=Math.min(min,x);
            }
        }
        return (count%2==0)?sum:sum-2*min;
    }
}
