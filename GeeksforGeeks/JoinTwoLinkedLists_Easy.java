// https://www.geeksforgeeks.org/problems/join-two-linked-lists/1

/*
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node joinTheLists(Node head1, Node head2) {
        // code here
        Node ptr=head1;
        while(ptr.next!=null) ptr=ptr.next;
        ptr.next=head2;
        return head1;
        
    }
}
