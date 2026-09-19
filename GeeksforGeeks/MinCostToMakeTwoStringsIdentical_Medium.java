// https://www.geeksforgeeks.org/problems/minimum-cost-to-make-two-strings-identical1107/1

class Solution {
    public int findMinCost(String s1, String s2, int costS1, int costS2) {
        // code here
        int[][] dp=new int[s1.length()+1][s2.length()+1];
        for(int i=0;i<s1.length();i++){
            Arrays.fill(dp[i],0);
        }
        for(int i=1;i<s1.length()+1;i++){
            for(int j=1;j<s2.length()+1;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)) dp[i][j]=dp[i-1][j-1]+1;
                else dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        int res=dp[s1.length()][s2.length()];
        int num1=s1.length()-res;
        int num2=s2.length()-res;
        return (num1*costS1)+(num2*costS2);
    }
}
