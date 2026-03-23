// https://www.geeksforgeeks.org/problems/sort-a-stack/1?page=4&status=unsolved&sortBy=submissions

class Solution {
    public void sortStack(Stack<Integer> st) {
        // code here
        Stack<Integer> stack1=new Stack<>();
        Stack<Integer> stack2=new Stack<>();
        stack1.push(st.pop());
        while(!st.isEmpty()){
            int num=st.pop();
            while(!stack1.isEmpty() && stack1.peek()>num){
                stack2.push(stack1.pop());
            }
            stack1.push(num);
            while(!stack2.isEmpty()){
                stack1.push(stack2.pop());
            }
        }
        while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
        }
        while(!stack2.isEmpty()){
                st.push(stack2.pop());
        }
        
        
    }
}
