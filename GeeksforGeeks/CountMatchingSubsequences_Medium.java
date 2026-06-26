// https://www.geeksforgeeks.org/problems/find-number-of-times-a-string-occurs-as-a-subsequence3020/1

class Solution {
    static final int  mod = 1000000007;
    public static int countWays(String s1, String s2) {
        // code here
       int n = s1.length();
       int m = s2.length();
       int[][] dp = new int[n+1][m+1];
       for(int[] r:dp) Arrays.fill(r,-1);
        return solve(0,0,s1,s2,dp);
    }
    static int solve(int i,int j,String s1,String s2,int[][] dp){
        if(j == s2.length()) return 1;
        if(i == s1.length()) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s1.charAt(i) == s2.charAt(j)){
           long take =  solve(i+1,j+1,s1,s2,dp);
           long skip = solve(i+1,j,s1,s2,dp);
           return dp[i][j] = (int)((take+skip)% mod);
        }
    return dp[i][j] = solve(i+1,j,s1,s2,dp);
    }
}
