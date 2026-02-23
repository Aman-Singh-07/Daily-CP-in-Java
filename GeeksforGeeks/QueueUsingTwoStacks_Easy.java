//  https://www.geeksforgeeks.org/problems/queue-using-two-stacks/1

// User function Template for Java
class StackQueue {
    public Stack<Integer> s1=new Stack<>();
    public Stack<Integer> s2=new Stack<>();
    public void push(int B) {
        s1.push(B);
    }

    public int pop() {
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        if(s2.isEmpty()) return -1;
        return s2.pop();
    }
}
