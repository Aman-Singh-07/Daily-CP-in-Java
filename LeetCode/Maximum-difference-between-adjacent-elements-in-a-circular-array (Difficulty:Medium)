// https://leetcode.com/problems/maximum-difference-between-adjacent-elements-in-a-circular-array/

class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length-1;i++){
            max=Math.max(max,Math.abs(nums[i]-nums[i+1]));
        }
        return Math.max(max,Math.abs(nums[0]-nums[nums.length-1]));
    }
}
