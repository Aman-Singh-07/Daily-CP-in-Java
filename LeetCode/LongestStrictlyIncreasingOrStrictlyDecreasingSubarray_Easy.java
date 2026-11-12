// https://leetcode.com/problems/longest-strictly-increasing-or-strictly-decreasing-subarray/description/?envType=daily-question&envId=2026-11-12

class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int count=1;
        int inc=1;
        int dc=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                inc++;
                dc=1;
            }else if(nums[i]<nums[i-1]){
                dc++;
                inc=1;
            }
            else{
                inc=1;
                dc=1;
            }
            count=Math.max(count,Math.max(inc,dc));
        }
        return count;
    }
}
