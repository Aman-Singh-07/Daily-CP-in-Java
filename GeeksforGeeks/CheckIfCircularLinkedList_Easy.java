// https://www.geeksforgeeks.org/problems/circular-linked-list/1?page=4&status=unsolved&sortBy=submissions

/* Structure of LinkedList
class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
*/
class Solution {
    boolean isCircular(Node head) {
        // Your code here
        Node ptr=head;
        while(ptr!=null){
            if(ptr.next==head) return true;
            ptr=ptr.next;
        }
        return false;
        
    }
}
