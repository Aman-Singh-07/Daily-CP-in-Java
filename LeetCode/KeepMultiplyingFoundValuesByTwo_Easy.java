// https://leetcode.com/problems/keep-multiplying-found-values-by-two/description/?envType=daily-question&envId=2025-11-19

class Solution {
    public int findFinalValue(int[] nums, int original) {
        int i=0;
        while(i<nums.length){
            if(nums[i]==original){
                original=2*original;
                i=0;
            }else i++;
        }
        return original;

    }
}
