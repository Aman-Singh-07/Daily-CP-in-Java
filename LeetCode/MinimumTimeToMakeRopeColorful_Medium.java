// https://leetcode.com/problems/minimum-time-to-make-rope-colorful/description/?envType=daily-question&envId=2025-11-03

class Solution {
    public int minCost(String colors, int[] neededTime) {
        int res=0;
        int max=neededTime[0];
        for(int i=1;i<colors.length();i++){
            if(colors.charAt(i)==colors.charAt(i-1)){
                res+=Math.min(max,neededTime[i]);
                max=Math.max(max,neededTime[i]);
            }else{
                max=neededTime[i];
            }
        }
        return res;
    }
}
