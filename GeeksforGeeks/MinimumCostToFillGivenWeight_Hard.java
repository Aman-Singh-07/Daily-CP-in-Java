// https://www.geeksforgeeks.org/problems/minimum-cost-to-fill-given-weight-in-a-bag1956/1

class Solution {
    public int minimumCost(int[] cost, int w) {
        int n = cost.length;
        int[] dp = new int[w + 1];
        
        java.util.Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        
        for (int j = 0; j < n; j++) {
            if (cost[j] == -1) continue; 
            
            int weight = j + 1;
            
            for (int i = weight; i <= w; i++) {
                if (dp[i - weight] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[i - weight] + cost[j]);
                }
            }
        }
        
        return dp[w] == Integer.MAX_VALUE ? -1 : dp[w];
    }
}
