// https://www.geeksforgeeks.org/problems/pizza-mania0155/1

class Solution {
    public int find(int x, int s, int m, int l, int cs, int cm, int cl,int[] dp) {
        // code here
        if(x<=0) return 0;
        else if(dp[x]!=-1) return dp[x];
        else{
            int res=cs+find(x-s,s,m,l,cs,cm,cl,dp);
            res=Math.min(res,cm+find(x-m,s,m,l,cs,cm,cl,dp));
            res=Math.min(res,cl+find(x-l,s,m,l,cs,cm,cl,dp));
            return dp[x]=res;
        }
    }
    public int minimumCost(int x, int s, int m, int l, int cs, int cm, int cl) {
        int[] dp=new int[x+1];
        for(int i=0;i<x+1;i++){
            dp[i]=-1;
        }
        return find(x,s,m,l,cs,cm,cl,dp);
    }
}
