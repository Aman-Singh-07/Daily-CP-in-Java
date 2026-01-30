// https://leetcode.com/problems/single-number-ii/description/

class Solution {
    public int singleNumber(int[] nums) {
        int a=0;
        int b=0;
        for(int num:nums){
            a=(a^num)&~b;
            b=(b^num)&~a;
        }
        return a;
    }
}
