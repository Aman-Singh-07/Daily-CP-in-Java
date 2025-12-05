// https://leetcode.com/problems/count-partitions-with-even-sum-difference/?envType=daily-question&envId=2025-12-05

class Solution {
    public int countPartitions(int[] nums) {
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        int res=0;
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            res+=nums[i];
            sum-=nums[i];
            if(Math.abs(res-sum)%2==0) count++;
        }
        return count;
        
    }
}
