// https://www.geeksforgeeks.org/problems/find-middle-of-circular-doubly-linked-list/1

class Solution {
    public static int findMiddle(Node head) {
        // code here
        Node slow=head;
        Node fast=head;
        if(head.next==head) return head.data;
        while(fast.next!=head && fast.next.next!=head){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
    }
};
