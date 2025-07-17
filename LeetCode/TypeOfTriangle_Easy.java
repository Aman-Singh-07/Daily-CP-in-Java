// https://leetcode.com/problems/type-of-triangle/?envType=daily-question&envId=2025-05-19

class Solution {
    public String triangleType(int[] nums) {
        if(nums[0]+nums[1]<=nums[2] || nums[1]+nums[2]<=nums[0] || nums[0]+nums[2]<=nums[1]){
            return "none";
        }
        else if(nums[0]==nums[1] && nums[1]==nums[2]){
            return "equilateral";
        }
        else if(nums[0]==nums[1] || nums[1]==nums[2] || nums[2]==nums[0]){
            return "isosceles";
        }
        return "scalene";
    }
}
