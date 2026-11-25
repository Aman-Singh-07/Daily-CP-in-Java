// https://www.geeksforgeeks.org/problems/sort-a-linked-list/1

/* Structure of a Linked List node
class Node {
    int data;
    Node next;
    Node(int key) {
        data = key;
        next = null;
    }
} */

class Solution {
    public Node mergeSort(Node head) {
        // code here
        if(head.next==null) return head;
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node head2=slow.next;
        slow.next=null;
        head=mergeSort(head);
        head2=mergeSort(head2);
        return merge(head,head2);
    }
    
    public Node merge(Node n1,Node n2){
        Node ptr1=n1;
        Node ptr2=n2;
        Node temp=new Node(-1);
        Node k=temp;
        while(ptr1!=null && ptr2!=null){
            if(ptr1.data<=ptr2.data){
                k.next=ptr1;
                ptr1=ptr1.next;
            }
            else{
                k.next=ptr2;
                ptr2=ptr2.next;
            }
            k=k.next;
        }
        if(ptr1==null) k.next=ptr2;
        else k.next=ptr1;
        
        return temp.next;
    }
}
