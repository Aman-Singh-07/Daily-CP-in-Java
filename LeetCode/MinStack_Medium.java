// https://leetcode.com/problems/min-stack/

class MinStack {
    Stack<Integer> st=new Stack<>();
    Stack<Integer> stack=new Stack<>();
    public MinStack() { }
    
    public void push(int value) {
        stack.push(value);
        if(st.isEmpty() || value<=st.peek()) st.push(value);
        
    }
    
    public void pop() {
        if(stack.peek().equals(st.peek())) st.pop();
        stack.pop();
    }
    
    public int top() {
        return stack.isEmpty()?-1:stack.peek();
    }
    
    public int getMin() {
        return st.isEmpty()?-1:st.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
