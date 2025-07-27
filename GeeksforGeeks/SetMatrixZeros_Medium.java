// https://www.geeksforgeeks.org/problems/set-matrix-zeroes/1

class Solution {
    public void setMatrixZeroes(int[][] mat) {
        // code here
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==0){
                    set1.add(i);
                    set2.add(j);
                }
            }
        }
        for(int num:set1){
            for(int i=0;i<mat[0].length;i++){
                mat[num][i]=0;
            }
        }
        for(int num:set2){
            for(int j=0;j<mat.length;j++){
                mat[j][num]=0;
            }
        }
        
    }
}
