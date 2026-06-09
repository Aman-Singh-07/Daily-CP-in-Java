// https://leetcode.com/problems/maximum-total-subarray-value-i/description/?envType=daily-question&envId=2026-06-09

class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long min=Long.MAX_VALUE;
        long max=Long.MIN_VALUE;
        for(int num:nums){
            min=Math.min(num,min);
            max=Math.max(num,max);
        }
        return k*(max-min);
    }
}
