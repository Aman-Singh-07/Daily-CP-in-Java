// https://www.geeksforgeeks.org/problems/swap-kth-node-from-beginning-and-kth-node-from-end-in-a-singly-linked-list/1

/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node swapKth(Node head, int k) {
        // code here
        Node ptr=head;
        Node first=head;
        Node second=head;
        for(int i=0;i<k-1 && ptr!=null && first!=null;i++){
            ptr=ptr.next;
            first=first.next;
        }
        if(ptr==null) return head;
        while(first.next!=null){
            second=second.next;
            first=first.next;
        }
        int temp=ptr.data;
        ptr.data=second.data;
        second.data=temp;
        return head;
        
    }
}
