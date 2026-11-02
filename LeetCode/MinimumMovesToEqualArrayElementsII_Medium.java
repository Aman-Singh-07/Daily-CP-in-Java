// https://leetcode.com/problems/minimum-moves-to-equal-array-elements-ii/description/?envType=daily-question&envId=2026-11-02

class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int median=nums[nums.length/2];
        int req=0;
        for(int num:nums){
            req+=Math.abs(num-median);
        }
        return req;
    }
}
