// https://www.geeksforgeeks.org/problems/pairwise-swap-of-nodes-in-linkelist/1

/*class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    } */
class Solution {
    public Node pairwiseSwap(Node head) {
        // code here
        if(head==null || head.next==null) return head;
        Node prev=head;
        Node curr=head.next.next;
        head=head.next;
        head.next=prev;
        while(curr!=null && curr.next!=null){
            prev.next=curr.next;
            prev=curr;
            Node next=curr.next.next;
            curr.next.next=curr;
            curr=next;
        }
        prev.next=curr;
        return head;
    }
}
