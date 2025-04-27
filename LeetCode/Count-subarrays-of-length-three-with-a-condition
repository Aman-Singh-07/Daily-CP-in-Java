//  https://leetcode.com/problems/count-subarrays-of-length-three-with-a-condition/description/?envType=daily-question&envId=2025-04-27

class Solution {
    public int countSubarrays(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length-2;i++){
            if((nums[i]+nums[i+2])*2==nums[i+1]){
                count++;
            }
        }
        return count;
        
    }
}
