// https://www.geeksforgeeks.org/problems/get-minimum-squares0538/1

class Solution {
    public int minSquares(int n) {
        int[] dp=new int[n+1];
        dp[0]=0;
        for(int i=1;i<=n;i++){
            dp[i]=i; 
            for(int j=1;j*j<=i;j++){
                dp[i]=Math.min(dp[i],dp[i-j*j]+1);
            }
        }
        return dp[n];
    }
}
