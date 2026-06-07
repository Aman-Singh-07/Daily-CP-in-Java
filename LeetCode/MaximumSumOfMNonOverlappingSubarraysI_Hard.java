// https://leetcode.com/problems/maximum-sum-of-m-non-overlapping-subarrays-i/description/

class Solution {
    public long maximumSum(int[] nums, int m, int l, int r) {
        int n=nums.length;
        long[] prefixSum=new long[n + 1];
        for(int i=0;i<n;i++){
            prefixSum[i+1]=prefixSum[i]+nums[i];
        }
        long[][] dp=new long[n+1][m+1];
        long MIN=(long) -1e15;
        for(int i=0;i<=n;i++){
            Arrays.fill(dp[i],MIN);
            dp[i][0]=0;
        }
        for(int j=1;j<=m;j++){
            Deque<Integer> dq=new ArrayDeque<>();
            for(int i=1;i<=n;i++){
                dp[i][j]=dp[i-1][j];
                int x=i-l;
                if(x>=0 && dp[x][j-1]!=MIN){
                    long val=dp[x][j -1]-prefixSum[x];
                    while(!dq.isEmpty() && (dp[dq.peekLast()][j-1]-prefixSum[dq.peekLast()])<=val){
                        dq.pollLast();
                    }
                    dq.offerLast(x);
                }

                while(!dq.isEmpty() && dq.peekFirst()<i-r){
                    dq.pollFirst();
                }

                if (!dq.isEmpty()) {
                    int best=dq.peekFirst();
                    long best_val=dp[best][j-1]-prefixSum[best];
                    dp[i][j]=Math.max(dp[i][j], best_val+prefixSum[i]);
                }
            }
        }

        long res=MIN;
        for (int j = 1; j <= m; j++) {
            res=Math.max(res,dp[n][j]);
        }

        return res;
    }
}
