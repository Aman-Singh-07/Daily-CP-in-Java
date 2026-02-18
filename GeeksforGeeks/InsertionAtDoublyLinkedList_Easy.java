// https://www.geeksforgeeks.org/problems/insert-a-node-in-doubly-linked-list/1

/*
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}
*/

class Solution {
    Node insertAtPos(Node head, int p, int x) {
        // code here
        if(head==null){
            Node n=new Node(x);
            return n;
        }
        Node ptr=head;
        for(int i=0;i<p && ptr.next!=null;i++){
            ptr=ptr.next;
        }
        Node n=new Node(x);
        n.next=ptr.next;
        n.prev=ptr;
        if(ptr.next!=null){
            ptr.next.prev=n;
        }
        ptr.next=n;
        return head;
        
    }
}
