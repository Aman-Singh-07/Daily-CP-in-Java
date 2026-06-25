// https://leetcode.com/problems/count-subarrays-with-majority-element-i/description/?envType=daily-question&envId=2026-06-25

class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n=nums.length;
        long res= 0;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=i;j<n;j++){
                if(nums[j]==target){
                    count++;
                }
                int len=j-i+1;
                if (count>len/2){
                    res++;
                }
            }
        }

        return (int) res;
    }
}
