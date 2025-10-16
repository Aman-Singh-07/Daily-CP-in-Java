// https://www.geeksforgeeks.org/problems/nth-node-from-end-of-linked-list/1?page=1&category=Linked%20List&status=unsolved&sortBy=submissions

/* Structure of node
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} */

class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int k) {
        // Your code here
        Node ptr=head;
        int len=0;
        while(ptr!=null){
            len++;
            ptr=ptr.next;
        }
        if(k>len) return -1;
        ptr=head;
        int x=len-k;
        while(x-->0){
            ptr=ptr.next;
        }
        return ptr.data;
        
    }
}
