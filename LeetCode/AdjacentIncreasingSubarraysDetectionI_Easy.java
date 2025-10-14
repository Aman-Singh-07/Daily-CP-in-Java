// https://leetcode.com/problems/adjacent-increasing-subarrays-detection-i/?envType=daily-question&envId=2025-10-14

class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int start=1;
        int index=0;
        int maxLen=0;
        for(int i=1;i<nums.size();i++){
            if(nums.get(i)>nums.get(i-1)) start++;
            else{
                index=start;
                start=1;
            }
            if (start>=2*k) return true;
            if (start>=k && index>=k) return true;
        }
        return false;
        


    }
}
