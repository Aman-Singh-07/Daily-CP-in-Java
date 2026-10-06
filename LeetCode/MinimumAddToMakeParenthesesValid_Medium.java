// https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/description/?envType=daily-question&envId=2026-10-06

class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(stack.isEmpty()) stack.push(ch);
            else{
                if(stack.peek()=='(' && ch==')'){
                    stack.pop();
                }
                else stack.push(ch);
            }
        }
        return stack.size();
    }
}
