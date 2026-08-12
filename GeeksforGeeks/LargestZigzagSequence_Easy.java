// https://www.geeksforgeeks.org/problems/largest-zigzag-sequence5416/1

class Solution {
    public int zigzagSequence(int[][] mat) {
        int n = mat.length;
        long[][] dp = new long[n][n];
        
        for (int i = 0; i < n; i++) {
            dp[0][i] = mat[0][i];
        }
        
        long res = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (k != j) {
                        dp[i][j] = Math.max(dp[i][j], (long) mat[i][j] + dp[i - 1][k]);
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            res = Math.max(res, dp[n - 1][i]);
        }
        
        return (int) res;
    }
}
