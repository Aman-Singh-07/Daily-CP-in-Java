// https://leetcode.com/problems/remove-outermost-parentheses/description/

class Solution {
    public String removeOuterParentheses(String s){
        Stack<Character> stack = new Stack<>();
        String res = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(!stack.isEmpty())
                    res+=s.charAt(i);
                stack.push(s.charAt(i));
            }
            else{
                stack.pop();
                if(!stack.isEmpty())
                    res+=s.charAt(i);
                }
        }
        return res;
    }
}
