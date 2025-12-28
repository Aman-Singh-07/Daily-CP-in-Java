//  https://leetcode.com/problems/maximum-score-of-a-split/description/
 class Solution {
    public long maximumScore(int[] nums) {
        int[] minArray=new int[nums.length];
        int min=nums[nums.length-1];
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]<min){
                min=nums[i];
            }
            minArray[i]=min;  
        }
        long[] prefixSum=new long[nums.length];
        prefixSum[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefixSum[i]=prefixSum[i-1]+nums[i];
        }
        long max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length-1;i++){
            max=Math.max(max,prefixSum[i]-minArray[i+1]);
        }
        return max;
    }
}
