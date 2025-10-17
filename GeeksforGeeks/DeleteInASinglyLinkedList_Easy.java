// https://www.geeksforgeeks.org/problems/delete-a-node-in-single-linked-list/1?page=1&category=Linked%20List&status=unsolved&sortBy=submissions

/*
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        this.data = d;
        this.next = null;
    }
}
*/
class Solution {
    Node deleteNode(Node head, int x) {
        if(x==1){
            return head.next;
        }
        
        Node ptr=head;
        int i=1;
        while(ptr!=null && i<x-1){
            ptr=ptr.next;
            i++;
        }
        if(ptr!= null && ptr.next!=null){
            ptr.next=ptr.next.next;
        }
        return head;
    }
}
