// https://leetcode.com/problems/minimum-operations-to-reduce-x-to-zero/description/?envType=daily-question&envId=2026-09-23

class Solution {
    public int minOperations(int[] nums, int x) {
        int sum=0;
        for(int num:nums) sum+=num;
        int res=sum-x;
        if(res==0) return nums.length;
        if(res<0) return -1;

        int left=0;
        int curr_sum=0;
        int len=-1;
        for(int i=0;i<nums.length;i++){
            curr_sum+=nums[i];
            while(curr_sum>res){
                curr_sum-=nums[left];
                left+=1;
            }
            if(curr_sum==res){
                len=Math.max(len,i-left+1);
            }
        }
        return len==-1?-1:nums.length-len;
    }
}
