// https://leetcode.com/problems/jump-game/description/

class Solution {
    public boolean canJump(int[] nums) {
        int count=0;
        for(int num:nums){
            if(count<0) return false;
            else if(count<num) count=num;
            count--;

        }
        return true;
    }
}
