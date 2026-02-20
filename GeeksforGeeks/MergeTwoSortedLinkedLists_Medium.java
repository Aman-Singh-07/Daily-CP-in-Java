// https://www.geeksforgeeks.org/problems/merge-two-sorted-linked-lists/1

/*
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    Node sortedMerge(Node head1, Node head2) {
        // code here
        Node temp=new Node(0);
        Node tail=temp;
        Node a=head1;
        Node b=head2;
        while(a!=null && b!=null){
            if(a.data<=b.data){
                tail.next=a;
                a=a.next;
            }else{
                tail.next=b;
                b=b.next;
            }
            tail=tail.next;
        }
        if(a!=null) tail.next=a;
        if(b!=null) tail.next=b;
        return temp.next;
    }
}
