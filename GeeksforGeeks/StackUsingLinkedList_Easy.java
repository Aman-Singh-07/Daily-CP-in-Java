// https://www.geeksforgeeks.org/problems/implement-stack-using-linked-list/1

// Node class
/* class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
} */

// Stack class
class myStack {
    Node head;
    int len;
    
    public myStack() {
        // Initialize your data members
        head=null;
        len=0;
        
    }

    public boolean isEmpty() {
        // check if the stack is empty
        return head==null;
        
    }

    public void push(int x) {
        // Adds an element x at the rear of the stack.
        Node ptr=new Node(x);
        ptr.next=head;
        head=ptr;
        len++;
        
    }

    public void pop() {
        // Removes the front element of the stack.
        if(!isEmpty()){
            head=head.next;
            len--;
        }
    }

    public int peek() {
        // Returns the front element of the stack.
        // If stack is empty, return -1.
        if(isEmpty()) return -1;
        return head.data;
        
    }

    public int size() {
        // Returns the current size of the stack.
        return len;
        
    }
}
