// https://leetcode.com/problems/projection-area-of-3d-shapes/description/?envType=problem-list-v2&envId=maths-m5-geometry

class Solution {
    public int projectionArea(int[][] grid) {
        int rowMax=0;
        int colMax=0;
        int nonZero=0;
        for(int i=0;i<grid.length;i++){
            int max1=0;
            int max2=0;
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]!=0) nonZero++;
                max1=Math.max(max1,grid[i][j]);
                max2=Math.max(max2,grid[j][i]);
            }
            rowMax+=max1;
            colMax+=max2;
        }
        return nonZero+rowMax+colMax;
        
    }
}
