// https://leetcode.com/problems/jump-game-vii/?envType=daily-question&envId=2026-05-25

class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {
        int n=s.length();
        if(s.charAt(n-1)=='1') return false;
        boolean[] dp=new boolean[n];
        dp[0]=true;
        int idx=0;
        for(int i=1;i<n;i++){
            if(i>=minJump && dp[i-minJump]){
                idx++;
            }
            if(i>maxJump && dp[i-maxJump-1]){
                idx--;
            }
            if(s.charAt(i)=='0' && idx>0){
                dp[i]=true;
            }
        }
        return dp[n-1];
    }
}
