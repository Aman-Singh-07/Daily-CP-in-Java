// https://leetcode.com/problems/merge-k-sorted-lists/

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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null || lists.length==0) return null;
        ListNode res=lists[0];
        for(int i=1;i<lists.length;i++){
            res=merger(res,lists[i]);
        }
        return res;
    }

    public ListNode merger(ListNode head1,ListNode head2){
        ListNode newNode=new ListNode(0);
        ListNode ptr=newNode;
        while(head1!=null && head2!=null){
            if(head1.val<=head2.val){
                ptr.next=head1;
                head1=head1.next;
            }else{
                ptr.next=head2;
                head2=head2.next;
            }
            ptr=ptr.next;
        }
        while(head1!=null){
            ptr.next=head1;
            head1=head1.next;
            ptr=ptr.next;
        }
        while(head2!=null){
            ptr.next=head2;
            head2=head2.next;
            ptr=ptr.next;
        }
        return newNode.next;
    }
}
