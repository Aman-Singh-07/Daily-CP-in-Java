// https://www.geeksforgeeks.org/problems/implement-queue-using-linked-list/1

// Node class
class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

// Queue class
class myQueue {
    Node ptr;
    Node head;
    int count;
    public myQueue() {
        // Initialize your data members
        head=null;
        ptr=null;
        
    }

    public boolean isEmpty() {
        // check if the queue is empty
        return head==null;
    }

    public void enqueue(int x) {
        // Adds an element x at the rear of the queue.
        Node newNode=new Node(x);
        if(head==null){
            head=newNode;
            ptr=newNode;
        }else{
            ptr.next=newNode;
            ptr=newNode;
        }
        count++;
    }

    public void dequeue() {
        // Removes the front element of the queue
        if(head==null) return;
        head=head.next;
        if(head==null){
            ptr=null;
        }
        count--;
    }

    public int getFront() {
        // Returns the front element of the queue.
        // If queue is empty, return -1.
        if(head==null) return -1;
        return head.data;
    }

    public int size() {
        // Returns the current size of the queue.
        return count;
    }
}
