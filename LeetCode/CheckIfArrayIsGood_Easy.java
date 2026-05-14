// https://leetcode.com/problems/check-if-array-is-good/description/?envType=daily-question&envId=2026-05-14

class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        while(i<nums.length-1){
            if(nums[i]!=(i+1)) return false;
            i++;
        }
        return nums[nums.length-1]==(i);
    }
}
