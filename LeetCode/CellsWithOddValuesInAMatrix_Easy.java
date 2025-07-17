// https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/

class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] inMatrix=new int[m][n];
        int row=indices.length;
        int column=indices[0].length;
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<row;k++){
                    if(i==indices[k][0]){
                        inMatrix[i][j]+=1;
                    }
                    if(j==indices[k][1]){
                        inMatrix[i][j]+=1;
                    }
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(inMatrix[i][j]%2!=0){
                    count++;
                }
            }
        }
        return count;
        
    }
}
