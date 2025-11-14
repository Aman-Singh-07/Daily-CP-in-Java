// https://www.geeksforgeeks.org/problems/finding-middle-element-in-a-linked-list/1?page=1&status=unsolved&sortBy=submissions

/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    int getMiddle(Node head) {
        // code here
        int count=0;
        Node ptr=head;
        while(ptr!=null){
            ptr=ptr.next;
            count++;
        }
        int x=count/2;
        ptr=head;
        while(x!=0){
            ptr=ptr.next;
            x--;
        }
        return ptr.data;
        
    }
}
