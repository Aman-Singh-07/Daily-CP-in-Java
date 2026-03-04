// https://leetcode.com/problems/special-positions-in-a-binary-matrix/description/?envType=daily-question&envId=2026-03-04

class Solution {
    public int numSpecial(int[][] mat) {
        int[] freq1=new int[mat.length];
        int[] freq2=new int[mat[0].length];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==1){
                    freq1[i]++;
                    freq2[j]++;
                }
            }
        }
        int res=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1 && freq1[i]==1 && freq2[j]==1) res++;
            }
        }
        return res;

    }
}
