// https://www.geeksforgeeks.org/problems/find-perimeter-of-shapes/1

class Solution {
    static int findPerimeter(int[][] mat) {
        // code here
        int count=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    if(i==0) count++;
                    if(i==mat.length-1) count++;
                    if(j==0) count++;
                    if(j==mat[0].length-1) count++;
                    if(i!=0){
                         if(mat[i-1][j]!=1) count++;
                    }
                    if(i!=mat.length-1) if(mat[i+1][j]!=1) count++;
                    if(j!=0) if(mat[i][j-1]!=1) count++;
                    if(j!=mat[0].length-1) if(mat[i][j+1]!=1) count++;
                }
            }
        }
        return count;
    }
}
