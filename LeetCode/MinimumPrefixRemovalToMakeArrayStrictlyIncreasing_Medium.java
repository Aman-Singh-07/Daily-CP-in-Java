// https://leetcode.com/problems/minimum-prefix-removal-to-make-array-strictly-increasing/description/

class Solution {
    public int minimumPrefixLength(int[] nums) {
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]<=nums[i-1]) return i;
        }
        return 0;
    }
}
