// https://leetcode.com/problems/transformed-array/description/?envType=daily-question&envId=2026-02-05

class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            int j=(i+nums[i])%n;
            if(j<0) j+=n; 
            res[i]=nums[j];
        }
        return res;
    }
}
