// https://leetcode.com/problems/minimum-moves-to-equal-array-elements/description/?envType=daily-question&envId=2026-11-01

class Solution {
    public int minMoves(int[] nums) {
        int min=nums[0];
        long sum=0;
        for(int num:nums){
            sum+=num;
            min=Math.min(min,num);
        }
        return (int) (sum-(long)min*nums.length);
    }
}
