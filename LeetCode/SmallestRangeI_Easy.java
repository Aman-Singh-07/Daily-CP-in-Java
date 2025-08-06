// https://leetcode.com/problems/smallest-range-i/description/?envType=problem-list-v2&envId=n32iyzu3

class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int min=Integer.MAX_VALUE;
        int max=0;
        for(int num:nums){
            if(num<min) min=num;
            if(num>max) max=num;
        }
        return (max-min)>=(k*2)?max-min-2*k:0;
    }
}
