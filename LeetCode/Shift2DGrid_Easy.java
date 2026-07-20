// https://leetcode.com/problems/shift-2d-grid/description/?envType=daily-question&envId=2026-07-20

class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {

        int m=grid.length;
        int n=grid[0].length;
        int total=m*n;
        k=k%total;
        List<List<Integer>> list=new ArrayList<>();
        for (int i=0;i<m;i++){
            List<Integer> row=new ArrayList<>();
            for(int j=0;j<n;j++){
                row.add(0);
            }

            list.add(row);
        }

        for(int i=0;i<m;i++){
            for (int j = 0;j<n;j++){
                int oldIndex=i*n+j;
                int newIndex=(oldIndex+k)%total;
                int newRow=newIndex/n;
                int newCol=newIndex%n;
                list.get(newRow).set(newCol, grid[i][j]);
            }
        }

        return list;
    }
}
