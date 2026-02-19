// https://www.geeksforgeeks.org/problems/remove-duplicate-element-from-sorted-linked-list/1

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
        if(head==null) return head;
        Node prev=head;
        Node curr=head;
        while(curr!=null){
            if(curr.data==prev.data) curr=curr.next;
            else{
                prev.next=curr;
                prev=curr;
            }
        }
        prev.next=curr;
        return head;
    }
}
