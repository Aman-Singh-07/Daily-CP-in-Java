// https://www.geeksforgeeks.org/problems/remove-duplicate-element-from-sorted-linked-list/1?page=2&status=unsolved&sortBy=submissions

/*
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class Solution {
    // Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head) {
        // Your code here
        Node ptr=head;
        while(ptr.next!=null && ptr!=null){
            if(ptr.data==ptr.next.data) ptr.next=ptr.next.next;
            else ptr=ptr.next;
        }
        return head;
        
    }
}
