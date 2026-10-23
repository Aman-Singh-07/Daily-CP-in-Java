// https://www.geeksforgeeks.org/problems/sorted-insert-for-circular-linked-list/1

/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public Node sortedInsert(Node head, int data) {
        // code here
        Node ptr=head;
        boolean isTrue=false;
        while(ptr.next!=head){
            if(ptr.data<data && ptr.next.data>=data){
                Node temp=ptr.next;
                Node newNode=new Node(data);
                ptr.next=newNode;
                newNode.next=temp;
                isTrue=true;
                break;
            }
            ptr=ptr.next;
        }
        if(!isTrue){
            Node newNode=new Node(data);
            ptr.next=newNode;
            newNode.next=head;
            
            if(head.data>=data) return ptr.next;
        }
        return head;
    }
}
