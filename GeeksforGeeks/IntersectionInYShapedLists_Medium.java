// https://www.geeksforgeeks.org/problems/intersection-point-in-y-shapped-linked-lists/1

/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    public Node intersectPoint(Node head1, Node head2) {
        // code here
        if(head1==null || head2==null) return null;
        Node x=head1;
        Node y=head2;
        while(x!=y){
            x=(x==null)?head2:x.next;
            y=(y==null)?head1:y.next;
        }
        return y;
    }
}
