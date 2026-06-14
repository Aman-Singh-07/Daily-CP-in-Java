// https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/description/?envType=daily-question&envId=2026-06-14

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
    public int pairSum(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;
        int count=0;
        while(curr!=null){
            ListNode temp=new ListNode(curr.val);
            temp.next=prev;
            prev=temp;
            curr=curr.next;
            count++;
        }
        ListNode root1=prev;
        ListNode root2=head;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<count/2;i++){
            max=Math.max(root1.val+root2.val,max);
            root1=root1.next;
            root2=root2.next;
        }
        return max;
        
    }
}
