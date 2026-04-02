// https://www.geeksforgeeks.org/problems/intersection-of-two-sorted-linked-lists/1?page=5&status=unsolved&sortBy=submissions

/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    public static Node findIntersection(Node head1, Node head2) {
        // code here.
        Node ptr=new Node(0);
        Node new1=ptr;
        while(head1!=null && head2!=null){
            if(head1.data==head2.data){
                Node temp=new Node(head1.data);
                new1.next=temp;
                head1=head1.next;
                head2=head2.next;
                new1=new1.next;
                
            }
            else if(head1.data<head2.data) head1=head1.next;
            else head2=head2.next;
        }
        
        return ptr.next;
    }
}
