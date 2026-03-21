// https://leetcode.com/problems/flip-square-submatrix-vertically/?envType=daily-question&envId=2026-03-21

class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        for(int i=0;i<(k)/2;i++){
            for(int j=y;j<y+k;j++){
                int temp=grid[i+x][j];
                grid[i+x][j]=grid[k+x-i-1][j];
                grid[k+x-i-1][j]=temp;
            }
        }
        return grid;
    }
}
