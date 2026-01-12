// https://leetcode.com/problems/minimum-time-visiting-all-points/description/?envType=daily-question&envId=2026-01-12

class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int res=0;
        for(int i=1;i<points.length;i++){
            int x=Math.abs(points[i][0]-points[i-1][0]);
            int y=Math.abs(points[i][1]-points[i-1][1]);
            res+=Math.max(x,y); 
        }
        return res;
    }
}
