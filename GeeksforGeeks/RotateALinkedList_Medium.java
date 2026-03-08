// https://www.geeksforgeeks.org/problems/rotate-a-linked-list/1?page=2&status=unsolved&sortBy=submissions

/*
class Node {
    int data;
    Node next;

    Node(int d){
        data=d;
        next=null;
   }
}
*/

class Solution {
    public Node rotate(Node head, int k) {
        // code here
        if(head==null || head.next==null || k==0) return head;
        Node temp=head;
        int n=1;
        while(temp.next!=null){
            temp=temp.next;
            n++;
        }
        k=(k%n);
        temp.next=head;
        Node ptr=temp;
        for(int i=0;i<k;i++){
            ptr=ptr.next;
        }
        head=ptr.next;
        ptr.next=null;
        return head;
        
        
        
    }
}
