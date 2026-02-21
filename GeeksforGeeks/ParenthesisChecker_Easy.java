//  https://www.geeksforgeeks.org/problems/parenthesis-checker2744/1


class Solution {
    public boolean isBalanced(String s) {
        // code here
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='[') stack.push(ch);
            else{
                if(!stack.isEmpty()){
                    
                    if(ch==')' && stack.peek()=='(') stack.pop();
                    else if(ch=='}' && stack.peek()=='{') stack.pop();
                    else if(ch==']' && stack.peek()=='[') stack.pop();
                    else return false;
                }
                else return false;
            }
        }
        if(stack.isEmpty()) return true;
        else return false;
    }
}
