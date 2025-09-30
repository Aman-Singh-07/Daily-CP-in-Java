// https://leetcode.com/problems/find-triangular-sum-of-an-array/description/?envType=daily-question&envId=2025-09-30

class Solution {
    public int triangularSum(int[] nums) {
        int n=nums.length;
        for(int k=n;k>1;k--){
            for(int i=0;i<k-1;i++){
                nums[i]=(nums[i]+nums[i+1])%10;
            }
        }
        return nums[0];
    }
}
