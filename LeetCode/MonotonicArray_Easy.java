// https://leetcode.com/problems/monotonic-array/

class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean isTrue1=true;
        boolean isTrue2=true;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                isTrue1=false;
                break;
            } 
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                isTrue2=false;
                break;
            }
        }
        return isTrue1||isTrue2;
    }
}
