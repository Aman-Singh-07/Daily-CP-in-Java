// https://leetcode.com/problems/smallest-missing-non-negative-integer-after-operations/description/?envType=daily-question&envId=2025-10-16

class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        int[] freq=new int[value];
        for(int num:nums){
            int mod=((num%value)+value)%value;
            freq[mod]++;
        }
        int mex=0;
        while(true){
            int mod=mex%value;
            if(freq[mod]==0) return mex;
            freq[mod]--;
            mex++;
        }
    }
}
