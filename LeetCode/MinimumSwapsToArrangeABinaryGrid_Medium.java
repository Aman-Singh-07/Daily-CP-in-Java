// https://leetcode.com/problems/minimum-swaps-to-arrange-a-binary-grid/description/?envType=daily-question&envId=2026-03-02

class Solution {
    public int minSwaps(int[][] grid) {
        int n=grid.length;
        int[] rowZeros=new int[n];
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=n-1;j>=0;j--){
                if(grid[i][j]==0) count++;
                else break;
            }
            rowZeros[i]=count;
        }
        int totalSwaps=0;
        for(int i=0;i<n;i++){
            int required=n-1-i;
            int foundIdx=-1;
            for(int j=i;j<n;j++){
                if(rowZeros[j]>=required){
                    foundIdx=j;
                    break;
                }
            }
            if(foundIdx==-1) return -1;
            for(int k=foundIdx;k>i;k--){
                int temp=rowZeros[k];
                rowZeros[k]=rowZeros[k-1];
                rowZeros[k-1] =temp;
                totalSwaps++;
            }
        }
        return totalSwaps;
    }
}
