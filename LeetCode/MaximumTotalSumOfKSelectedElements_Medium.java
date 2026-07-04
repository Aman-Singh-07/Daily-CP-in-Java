// https://leetcode.com/problems/maximum-total-sum-of-k-selected-elements/description/

class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        long sum=0;
        Arrays.sort(nums);
        int i=nums.length-1;
        while(k>0){
            long num=nums[i];
            if(mul>1){
                sum+=(num*mul);
                mul--;
            }
            else{
                sum+=num;
            }
            k--;
            i--;
        }
        return sum;
    }
}
