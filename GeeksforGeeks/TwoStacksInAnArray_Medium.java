// https://www.geeksforgeeks.org/problems/implement-two-stacks-in-an-array/1

class twoStacks {
    public int len;
    public int[] arr;
    public int top1;
    public int top2;
    twoStacks() {
        len=100;
        arr=new int[len];
        top1=-1;
        top2=len;
    }
    // Function to push an integer into the stack1.
    void push1(int x) {
        // code here
        if(top1<top2-1) arr[++top1]=x;
        
    }

    // Function to push an integer into the stack2.
    void push2(int x) {
        
        // code here
        if(top1<top2-1) arr[--top2]=x;
    }

    // Function to remove an element from top of the stack1.
        
    int pop1() {
        // code here
        if(top1>=0) return arr[top1--];
        return -1;
    }

        
    // Function to remove an element from top of the stack2.
    int pop2() {
        // code here
        if(top2<len) return arr[top2++];
        return -1;
    }
}
