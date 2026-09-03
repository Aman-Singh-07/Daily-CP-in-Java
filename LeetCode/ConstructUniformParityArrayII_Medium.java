// https://leetcode.com/problems/construct-uniform-parity-array-ii/?envType=daily-question&envId=2026-09-03

class Solution {
    public boolean uniformArray(int[] nums1) {
        boolean isOdd=false;
        int min=nums1[0];
        for(int num:nums1){
            min=Math.min(num,min);
            if(num%2!=0) isOdd=true;
        }
        if(min%2!=0) return true;
        return !isOdd;
    }
}
