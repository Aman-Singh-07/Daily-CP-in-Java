// https://leetcode.com/problems/find-greatest-common-divisor-of-array/

class Solution {
    public int findGCD(int[] nums) {
        int smallest=nums[0];
        int largest=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<smallest){
                smallest=nums[i];
            }
            if(nums[i]>largest){
                largest=nums[i];
            }
        }
        for(int i=smallest;i>1;i--){
            if(largest%i==0 && smallest%i==0){
                return i;
            }
        }
        return 1;
        
    }
}
