// https://leetcode.com/problems/valid-parenthesis-string/?envType=daily-question&envId=2026-10-04

class Solution {
    public boolean checkValidString(String s) {
        int left=0;
        int right=0;
        for(int i=0;i<s.length();i++){
            left+=(s.charAt(i)=='(')?1:-1;
            left=Math.max(left,0);
            right+=(s.charAt(i)==')')?-1:1;
            if(right<0) return false;
        }
        return left==0;
    }
}
