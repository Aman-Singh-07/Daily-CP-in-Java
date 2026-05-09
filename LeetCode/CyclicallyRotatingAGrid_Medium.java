// https://leetcode.com/problems/cyclically-rotating-a-grid/description/?envType=daily-question&envId=2026-05-09

class Solution {
    public int[][] rotateGrid(int[][] grid, int k) {
        int p=0;
        int q=0;
        int r=grid.length-1;
        int s=grid[0].length-1;
        while(p<r && q<s){
            int len=r-p;
            int wid=s-q;
            int per=2*len+2*wid;
            int rad=k%per;
            while(rad-->0){
                int temp=grid[p][q];
                for(int i=q;i<s;i++){
                    grid[p][i]=grid[p][i+1];
                }
                for(int i=p;i<r;i++){
                    grid[i][s]=grid[i+1][s];
                }
                for(int i=s;i>q;i--){
                    grid[r][i]=grid[r][i-1];
                }
                for(int i=r;i>p;i--){
                    grid[i][q]=grid[i-1][q];
                }
                grid[p+1][q]=temp;
            }
            p++;
            q++;
            r--;
            s--;
        }
        return grid;
    }
}
