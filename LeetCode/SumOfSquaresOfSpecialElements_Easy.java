// https://leetcode.com/problems/sum-of-squares-of-special-elements/description/?envType=daily-question&envId=2026-10-11

class Solution {
    public int sumOfSquares(int[] nums) {
        int res=0;
        for(int i=0;i<nums.length;i++){
            if(nums.length%(i+1)==0) res+=nums[i]*nums[i];
        }
        return res;
    }
}
