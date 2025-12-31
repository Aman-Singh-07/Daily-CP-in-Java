// https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode ptr=head;
        int count=0;
        while(ptr!=null){
            count++;
            ptr=ptr.next;
        }
        int req=count-n;
        if(req==0) return head.next;
        ptr=head;
        for(int i=1;i<req;i++){ 
            ptr=ptr.next; 
        }
        ptr.next=ptr.next.next;
        return head;
    }
}
