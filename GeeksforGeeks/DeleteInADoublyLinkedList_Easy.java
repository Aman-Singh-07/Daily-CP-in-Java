// https://www.geeksforgeeks.org/problems/delete-node-in-doubly-linked-list/1

/*
Structure of a Doubly LinkList
class Node {
    int data;
    Node next;
    Node prev;

    Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public Node delPos(Node head, int x) {
        // code here
        if(head==null || head.next==null) return null;
        if(x==1){
            head.next.prev=null;
            return head.next;
        }
        Node ptr=head;
        for(int i=1;i<x-1;i++){
            ptr=ptr.next;
        }
        ptr.next=ptr.next.next;
        if(ptr.next!=null) ptr.next.prev=ptr;
        return head;
    }
}
