// https://www.geeksforgeeks.org/problems/delete-middle-of-linked-list/1?page=1&difficulty=Easy&status=unsolved&sortBy=submissions

/*
class Node {
    int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    Node deleteMid(Node head) {
        // This is method only submission.
        // You only need to complete the method.
        if(head==null || head.next==null) return null;
        Node slow=head;
        Node fast=head;
        Node prev=null;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            prev=slow;
            slow=slow.next;
        }
        if(prev!=null){
            prev.next=slow.next;
        }
        return head;
    }
}
