// https://leetcode.com/problems/longest-harmonious-subsequence/?envType=daily-question&envId=2025-06-30

class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int countRes=0;
        for(int i=0;i<nums.length-1;i++){
            if(Math.abs(nums[i+1]-nums[i])==1){
                int count=0;
                for(int num:nums){
                    if(num==nums[i] || num==nums[i+1]) count++;
                }
                if(count>countRes) countRes=count;
            }
        }
        return countRes;
    }
}
