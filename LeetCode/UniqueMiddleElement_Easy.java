// https://leetcode.com/problems/unique-middle-element/description/
class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int num=nums[nums.length/2];
        int count=0;
        for(int n:nums){
            if(num==n) count++;
            if(count>1) return false;
        }
        return true;
    }
}
