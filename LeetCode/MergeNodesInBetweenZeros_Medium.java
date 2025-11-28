// https://leetcode.com/problems/merge-nodes-in-between-zeros/description/

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
    public ListNode mergeNodes(ListNode head) {
        ListNode ptr=head.next;
        ListNode save=head;
        int sum=0;
        while(ptr!=null){
            if(ptr.val==0){
                save.next=new ListNode(sum);
                save=save.next;
                sum=0;
            }
            else{
                sum+=ptr.val;
            }
            ptr=ptr.next;
        }
        return head.next;
    }
}
