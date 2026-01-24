// https://leetcode.com/problems/minimize-maximum-pair-sum-in-array/description/?envType=daily-question&envId=2026-01-24

class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int max=0;
        int i=0;
        int j=nums.length-1;
        while(i<j){
            max=Math.max(nums[i]+nums[j],max);
            i++;
            j--;
        }
        return max;
        
    }
}
