// https://leetcode.com/problems/delete-nodes-from-linked-list-present-in-array/description/?envType=daily-question&envId=2025-11-01

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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        ListNode temp=new ListNode(0);
        temp.next=head;
        ListNode prev=temp;
        ListNode curr=head;
        while(curr!=null){
            if(set.contains(curr.val)){
                prev.next=curr.next;
            }else{
                prev=curr; 
            }
            curr=curr.next;
        }
        return temp.next;
    }
}
