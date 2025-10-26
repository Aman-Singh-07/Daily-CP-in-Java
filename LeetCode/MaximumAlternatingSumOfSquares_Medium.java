// https://leetcode.com/contest/weekly-contest-473/problems/maximum-alternating-sum-of-squares/description/

class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=Math.abs(nums[i]);
        }
        long sum=0;
        Arrays.sort(nums);
        int index=(nums.length+1)/2;
        int i=nums.length-1;
        while(index-->0){
            sum+=nums[i]*nums[i];
            i--;
        }
        i=0;
        index=nums.length-(nums.length+1)/2;
        while(index-->0){
            sum-=nums[i]*nums[i];
            i++;
        }
        return sum;
    }
}
