// https://leetcode.com/problems/maximum-unique-subarray-sum-after-deletion/?envType=daily-question&envId=2025-07-25

class Solution {
    public int maxSum(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0) set.add(nums[i]);
        }
        int sum=0;
        for(int num:set){
            sum+=num;
        }
        int max=-100;
        if(set.size()==0){
            for(int i=0;i<nums.length;i++){
                if(nums[i]<=0 && nums[i]>max) max=nums[i];
            }
        }
        return set.size()==0?max:sum;
        
    }
}
