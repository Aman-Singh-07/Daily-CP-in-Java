// https://leetcode.com/problems/minimum-operations-to-make-a-uni-value-grid/description/?envType=daily-question&envId=2026-04-28

class Solution {
    public int minOperations(int[][] grid, int x) {
        ArrayList<Integer> list=new ArrayList<>();
        int rem=grid[0][0]%x;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                list.add(grid[i][j]);
                if(grid[i][j]%x!=rem){
                    return -1;
                }

            }
        }
        Collections.sort(list);
        int mid=(list.get(list.size()/2));
        int sum1=0;
        for(int n:list){
            if(Math.abs(mid-n)%x==0){
                sum1+=Math.abs(mid-n)/x;
            }
        }
        return sum1;
    }
}
