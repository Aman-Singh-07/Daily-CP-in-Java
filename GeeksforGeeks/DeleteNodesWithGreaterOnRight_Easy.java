// https://www.geeksforgeeks.org/problems/delete-nodes-having-greater-value-on-right/1

/* Structure of linked list node
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
    Node compute(Node head) {
        // code here
        Node curr=head;
        Node prev=null;
        while(curr!=null){
            Node temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        head=prev;
        curr=head;
        int maxdata=head.data;
        while(curr!=null && curr.next!=null){
            if(curr.next.data<maxdata){
                curr.next=curr.next.next;
            }else{
                curr=curr.next;
                maxdata=curr.data;
            }
        }
        curr=head;
        prev=null;
        while(curr!=null){
            Node temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
        
        
    }
}
