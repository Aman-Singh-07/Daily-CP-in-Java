// https://leetcode.com/problems/minimum-initial-energy-to-finish-tasks/description/?envType=daily-question&envId=2026-05-12

class Solution {
    public int minimumEffort(int[][] tasks) {
        Arrays.sort(tasks,(a,b)->(b[1]-b[0])-(a[1]-a[0]));
        int count=0;
        int res=0;
        for(int i=0;i<tasks.length;i++){
            if(count<tasks[i][1]){
                res+=(tasks[i][1]-count);
                count=tasks[i][1];
            }
            count-=tasks[i][0];
        }
        return res;
    }
}
