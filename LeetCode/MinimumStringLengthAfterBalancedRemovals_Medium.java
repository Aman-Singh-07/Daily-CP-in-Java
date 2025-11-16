// https://leetcode.com/problems/minimum-string-length-after-balanced-removals/description/

class Solution {
    public int minLengthAfterRemovals(String s) {
        int counta=0;
        int countb=0;
        for(char ch:s.toCharArray()){
            if(ch=='a') counta++;
            else countb++;
        }
        return Math.abs(counta-countb);
    }
}
