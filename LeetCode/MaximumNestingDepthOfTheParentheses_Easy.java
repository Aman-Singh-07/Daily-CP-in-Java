// https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/description/?envType=daily-question&envId=2026-09-28

class Solution {
    public int maxDepth(String s) {
        Stack<Character> stack=new Stack<>();
        int res=0;
        for(char ch:s.toCharArray()){
            if(ch=='(') stack.push(ch);
            if(ch==')'){
                res=Math.max(res,stack.size());
                stack.pop();
            }
        }
        return res;
    }
}
