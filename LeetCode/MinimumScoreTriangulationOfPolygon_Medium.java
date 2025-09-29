// https://leetcode.com/problems/minimum-score-triangulation-of-polygon/?envType=daily-question&envId=2025-09-29

class Solution {
    public int minScoreTriangulation(int[] values) {
        int n=values.length;
        int[][] arr=new int[n][n];
        for(int i=2;i<n;i++){
            for(int j=0;j+i<n;j++){
                int k=i+j;
                arr[j][k]=Integer.MAX_VALUE;
                for(int l=j+1;l<k;l++){
                    arr[j][k]=Math.min(arr[j][k],
                        arr[j][l]+arr[l][k]+values[j]*values[k]*values[l]);
                }
            }
        }
        return arr[0][n-1];
    }
}
