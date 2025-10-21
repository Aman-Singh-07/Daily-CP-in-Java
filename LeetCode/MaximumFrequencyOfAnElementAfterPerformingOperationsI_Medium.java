//  https://leetcode.com/problems/maximum-frequency-of-an-element-after-performing-operations-i/description/?envType=daily-question&envId=2025-10-21

class Solution {
    public int maxFrequency(int[] nums, int k, int numOperations) {
        int mini=Integer.MAX_VALUE;
        int maxi=Integer.MIN_VALUE;
        int res=0;
        for(int i:nums){
            maxi=Math.max(maxi,i);
            mini=Math.min(mini,i);
        }
        int[] freq=new int[maxi+1];
        for(int i:nums){
            freq[i]++;
        }
        for(int i=1;i<=maxi;i++){
            freq[i]+=freq[i-1];
        }
        for(int curr=mini;curr<=maxi;curr++){
            int l=Math.max(mini,curr-k);
            int r=Math.min(maxi,curr+k);
            int f=freq[curr]-freq[curr-1];
            int leftFreq=(l-1>=0)?freq[l-1]:0;
            int extra=Math.min(numOperations,freq[r]-leftFreq-f);
            res=Math.max(res,f+extra);
        }
        return res;
    }
}
