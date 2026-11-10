// https://leetcode.com/problems/climbing-stairs-ii/?envType=daily-question&envId=2026-11-10

class Solution {
    public int climbStairs(int n, int[] costs) {
        int[] dp=new int[n+1];
        for(int i=1;i<=n;i++){
            int min=Integer.MAX_VALUE;
            for(int j=Math.max(0,i-3);j<i;j++){
                min=Math.min(min,dp[j]+(i-j)*(i-j)+costs[i-1]);
            }
            dp[i]=min;
        }
        return dp[n];
    }
}
