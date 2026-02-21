// https://www.geeksforgeeks.org/problems/operations-on-stack/1


class Solution {
    // Function to push an element into the stack.
    void insert(Stack<Integer> s, int x) {
        // code here
        s.push(x);
    }

    // Function to remove top element from stack.
    void remove(Stack<Integer> s) {
        if(!s.isEmpty()) s.pop();
        // code here
    }

    // Function to print the top element of stack.
        
    void headOf_Stack(Stack<Integer> s) {
        // code here
        if(!s.isEmpty()) System.out.println(s.peek());
    }

        
    // Function to search an element in the stack.
    boolean find(Stack<Integer> s, int val) {
        // code here
        return s.contains(val);
        
    }
}
