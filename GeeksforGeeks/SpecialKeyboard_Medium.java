// https://www.geeksforgeeks.org/problems/special-keyboard3018/1

class Solution {
    public int optimalKeys(int n) {
        if (n <= 6) {
            return n;
        }
        
        int[] dp = new int[n + 1];
        
        for (int i = 1; i <= 6; i++) {
            dp[i] = i;
        }
        
        for (int i = 7; i <= n; i++) {
            for (int j = 1; j <= i - 3; j++) {
                dp[i] = Math.max(dp[i], dp[j] * (i - j - 1));
            }
        }
        
        return dp[n];
    }
}
