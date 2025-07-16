// https://leetcode.com/problems/find-the-maximum-length-of-valid-subsequence-i/?envType=daily-question&envId=2025-07-16

class Solution {
    public int maximumLength(int[] nums) {
        if(nums.length==2) return 2;
        int countEven=0;
        int countOdd=0;
        int countAlt=1;
        for(int num:nums){
            if(num%2==0) countEven++;
            else countOdd++;
        }
        for(int i=0;i<nums.length-1;i++){
            if((nums[i]%2==0 && nums[i+1]%2!=0) || (nums[i]%2!=0 && nums[i+1]%2==0)) countAlt++;
        }
        return Math.max(Math.max(countEven,countOdd),countAlt);
    }
}
