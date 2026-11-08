// https://leetcode.com/problems/count-servers-that-communicate/?envType=daily-question&envId=2026-11-08

class Solution {
    public int countServers(int[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1){
                    boolean isTrue=false;
                    for(int k=0;k<grid.length;k++){
                        if(grid[k][j]==1 && k!=i){
                            isTrue=true;
                            break;
                        }
                    }
                    if(!isTrue){
                        for(int k=0;k<grid[i].length;k++){
                            if(grid[i][k]==1 && j!=k){
                                isTrue=true;
                                break;
                            }
                        }
                    }
                    if(isTrue) count++;
                }
            }
        }
        return count;
    }
}
