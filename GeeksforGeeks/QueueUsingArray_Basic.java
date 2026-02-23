// https://www.geeksforgeeks.org/problems/implement-queue-using-array/1

class myQueue {
    public int size;
    public int[] arr;
    int front;
    int rare;
    // Constructor
    public myQueue(int n) {
        // Define Data Structures
        arr=new int[n];
        size=n;
        front=-1;
        rare=-1;
        
        
    }

    public boolean isEmpty() {
        // Check if queue is empty
        return rare==-1;
    }

    public boolean isFull() {
        // Check if queue is full
        return (rare+1)%size==front;
    }

    public void enqueue(int x) {
        // Enqueue
        if(front==-1){
            front=0;
            rare=0;
        }
        else rare=(rare+1)%size;
        arr[rare]=x;
        
    }

    public void dequeue() {
        // Dequeue
        if(front==rare){
            front=-1;
            rare=-1;
        }
        else front=(front+1)%size;
    }

    public int getFront() {
        // Get front element
        if(isEmpty()) return -1;
        return arr[front];
    }

    public int getRear() {
        // Get last element
        if(isEmpty()) return -1;
        return arr[rare];
    }
}
