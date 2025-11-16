// https://leetcode.com/problems/maximize-expression-of-three-elements/description/

class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length-1]+nums[nums.length-2]-nums[0];
    }
}
