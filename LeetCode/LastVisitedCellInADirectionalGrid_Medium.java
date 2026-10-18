// https://leetcode.com/problems/last-visited-cell-in-a-directional-grid/description/

class Solution {
    public int[] lastVisitedCell(char[][] grid) {
        int[] res=new int[2];
        HashSet<String> set=new HashSet<>();
        set.add("0,0");
        int l=0;
        int r=0;
        int n=grid.length;
        int m=grid[0].length;
        while(true){
            int temp1=l;
            int temp2=r;
            if(grid[temp1][temp2]=='R') r++;
            else if(grid[temp1][temp2]=='D') l++;
            else if(grid[temp1][temp2]=='U') l--;
            else if(grid[temp1][temp2]=='L') r--;

            if(l<0 || l>=n || r<0 || r>=m || set.contains(l+","+r)){
                res[0]=temp1;
                res[1]=temp2;
                return res;
            }
            set.add(l+","+r);
        }
    }
}
