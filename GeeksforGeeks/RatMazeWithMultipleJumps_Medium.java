// https://www.geeksforgeeks.org/problems/rat-maze-with-multiple-jumps3852/1

import java.util.ArrayList;

class Solution {
    public ArrayList<ArrayList<Integer>> shortestDist(int[][] mat) {
        int n=mat.length;
        int[][] ans=new int[n][n];
        boolean[][] failed=new boolean[n][n];
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        if(solve(0,0,n,mat,ans,failed)){
            for(int i=0;i<n;i++){
                ArrayList<Integer> row=new ArrayList<>();
                for(int j=0;j<n;j++){
                    row.add(ans[i][j]);
                }
                result.add(row);
            }
            return result;
        }
        ArrayList<Integer> failedRow=new ArrayList<>();
        failedRow.add(-1);
        result.add(failedRow);
        return result;
    }

    private boolean solve(int r,int c,int n,int[][] mat,int[][] ans,boolean[][] failed) {
        if(r==n-1&&c==n-1){
            ans[r][c]=1;
            return true;
        }
        if(r>=n||c>=n||mat[r][c]==0||failed[r][c]){
            return false;
        }
        ans[r][c]=1;
        int maxJump=mat[r][c];
        for(int jump=1;jump<=maxJump;jump++){
            if(solve(r,c+jump,n,mat,ans,failed)){
                return true;
            }
            if(solve(r+jump,c,n,mat,ans,failed)){
                return true;
            }
        }
        ans[r][c]=0;
        failed[r][c]=true;
        return false;
    }
}
