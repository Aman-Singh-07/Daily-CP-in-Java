// https://leetcode.com/problems/smallest-index-with-digit-sum-equal-to-index/

class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(i==digitSum(nums[i])){
                return i;
            }
        }
        return -1;
        
    }
    public static int digitSum(int num){
        int sum=0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
}
