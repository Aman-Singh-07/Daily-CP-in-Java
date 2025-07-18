//  https://leetcode.com/problems/minimum-time-visiting-all-points/description/

class Solution {
    public int minTimeToVisitAllPoints(int[][] p) {
        int time=0;
        for(int i=0;i<p.length-1;i++){
                time+=Math.max(Math.abs(p[i][0]-p[i+1][0]),Math.abs(p[i][1]-p[i+1][1]));
        }
        return time;
        
    }
}
