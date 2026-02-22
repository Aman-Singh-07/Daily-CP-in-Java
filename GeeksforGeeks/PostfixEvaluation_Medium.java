// https://www.geeksforgeeks.org/problems/evaluation-of-postfix-expression1735/1

class Solution {
    public int evaluatePostfix(String[] arr) {
        // code here
        Stack<Integer> s=new Stack<>();
        for(String ch:arr){
            if(ch.equals("+")){
                int b=s.pop();
                int a=s.pop();
                s.push(a+b);
                
            }
            else if(ch.equals("-")){
                int b=s.pop();
                int a=s.pop();
                s.push(a-b);
                
            }
            else if(ch.equals("*")){
                int b=s.pop();
                int a=s.pop();
                s.push(a*b);
                
            }
            else if(ch.equals("/")){
                int b=s.pop();
                int a=s.pop();
                s.push(Math.floorDiv(a,b));
                
            }
            else if(ch.equals("^")){
                int b=s.pop();
                int a=s.pop();
                s.push((int) Math.pow(a,b));
            }
            else{
                s.push(Integer.valueOf(ch));
            }
        }
        return s.pop();
    }
}
