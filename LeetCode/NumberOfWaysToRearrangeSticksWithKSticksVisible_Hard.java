// https://leetcode.com/problems/number-of-ways-to-rearrange-sticks-with-k-sticks-visible/description/

class Solution {
    public static final int MOD=1000000007;
    public int rearrangeSticks(int n, int k) {
        long[][] arr=new long[n+1][k+1];
        arr[0][0]=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=k;j++){
                arr[i][j]=(arr[i-1][j-1]+(i-1)*arr[i-1][j])%MOD;
            }
        }
        return (int) arr[n][k];
    }
}
