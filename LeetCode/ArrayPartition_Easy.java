// https://leetcode.com/problems/array-partition/description/

class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int res=0;
        for(int i=nums.length-2;i>=0;i-=2){
            res+=nums[i];
        }
        return res;
    }
}
