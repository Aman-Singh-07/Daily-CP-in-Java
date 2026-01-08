// https://leetcode.com/problems/maximum-subarray-sum-with-length-divisible-by-k/description/?envType=daily-question&envId=2026-01-08

class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        int n=nums.length;
        long[] prefix=new long[n+1];
        for(int i=0;i<n;i++){
            prefix[i+1]=prefix[i]+nums[i];
        }
        long[] minPrefix=new long[k];
        Arrays.fill(minPrefix,Long.MAX_VALUE);
        long maxSum=Long.MIN_VALUE;
        for(int i=0;i<=n;i++){
            int rem=i%k;
            if(minPrefix[rem]!=Long.MAX_VALUE){
                maxSum=Math.max(maxSum,prefix[i]-minPrefix[rem]);
            }
            minPrefix[rem]=Math.min(minPrefix[rem],prefix[i]);
        }
        return maxSum;
    }
}
