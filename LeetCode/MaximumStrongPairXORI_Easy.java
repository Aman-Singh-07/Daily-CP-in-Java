// https://leetcode.com/problems/maximum-strong-pair-xor-i/?envType=problem-list-v2&envId=n32iyzu3

class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(Math.abs(nums[i]-nums[j])<=Math.min(nums[i],nums[j])){
                    max=Math.max(max,(nums[i]^nums[j]));
                }
            }
        }
        return max;
        
    }
}
