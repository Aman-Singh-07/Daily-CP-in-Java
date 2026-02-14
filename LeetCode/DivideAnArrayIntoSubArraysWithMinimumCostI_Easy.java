// https://leetcode.com/problems/divide-an-array-into-subarrays-with-minimum-cost-i/?envType=daily-question&envId=2026-02-14

class Solution {
    public int minimumCost(int[] nums) {
        int res=nums[0];
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=min1){
                min2=min1;
                min1=nums[i];
            }
            else if(nums[i]<=min2){
                min2=nums[i];
            }
            
        }
        return res+min1+min2;
    }
}
