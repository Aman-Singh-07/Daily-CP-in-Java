// https://leetcode.com/problems/sum-of-all-subset-xor-totals/description/?envType=problem-list-v2&envId=n32iyzu3

class Solution {
    public int subsetXORSum(int[] nums) {
        return Xor(nums,0,0);
        
    }
    public int Xor(int[] nums,int current,int index){
        if(index==nums.length) return current;
        int include=Xor(nums,current^nums[index],index+1);
        int exclude=Xor(nums,current,index+1);
        return include+exclude;
    }
}
