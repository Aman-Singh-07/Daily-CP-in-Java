// https://www.geeksforgeeks.org/problems/infix-to-postfix-1587115620

class Solution {
    public static String infixToPostfix(String s) {
        // code here
        StringBuilder sb=new StringBuilder();
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='+' || ch=='-'){
                while(!stack.isEmpty() && stack.peek()!='('){
                    sb.append(stack.pop());
                }
                stack.push(ch);
            }
            else if(ch=='*' || ch=='/'){
                while(!stack.isEmpty() && (stack.peek()=='*' || stack.peek()=='/' || stack.peek()=='^')){
                    sb.append(stack.pop());
                }
                stack.push(ch);
            }
            else if(ch=='^'){
                stack.push(ch);
            }
            else if(ch=='('){
                stack.push(ch);
            }
            else if(ch==')'){
                while(!stack.isEmpty() && stack.peek()!='('){
                    sb.append(stack.pop());
                }
                if(!stack.isEmpty()) stack.pop();
            }
            else sb.append(ch);
        }
        while(!stack.isEmpty()) sb.append(stack.pop());
        return sb.toString();
    }
}
