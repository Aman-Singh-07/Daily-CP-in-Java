// https://leetcode.com/problems/score-of-parentheses/description/?envType=daily-question&envId=2026-10-05

class Solution {
    public int scoreOfParentheses(String s) {
        int count=0;
        int res=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') count++;
            else{
                count--;
                if(s.charAt(i-1)=='(') res+=1<<count;
            }
        }
        return res;
    }
}
