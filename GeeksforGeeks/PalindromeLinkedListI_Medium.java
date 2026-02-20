// https://www.geeksforgeeks.org/problems/check-if-linked-list-is-pallindrome/1

/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    public boolean isPalindrome(Node head) {
        // code here
        if(head==null || head.next==null) return true;
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node prev=null;
        Node curr=slow.next;
        while(curr!=null){
            Node nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }
        Node ptr1=head;
        Node ptr2=prev;
        while(ptr2!=null){
            if(ptr1.data!=ptr2.data) return false;
            ptr1=ptr1.next;
            ptr2=ptr2.next;
        }
        return true;
        
        
    }
}
