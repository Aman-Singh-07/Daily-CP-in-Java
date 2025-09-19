// https://www.geeksforgeeks.org/problems/min-add-to-make-parentheses-valid/1

class Solution {
    public int minParentheses(String s) {
        // code here
        while(s.contains("()")){
            s=s.replace("()","");
        }
        return s.length();
    }
}
