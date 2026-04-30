// https://leetcode.com/problems/intersection-of-two-linked-lists/description/?envType=problem-list-v2&envId=wqama0x5

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int len1=0;
        int len2=0;
        ListNode temp1=headA;
        ListNode temp2=headB;
        while(temp1!=null){
            len1++;
            temp1=temp1.next;
        }
        while(temp2!=null){
            len2++;
            temp2=temp2.next;
        }
        if(len1>len2){
            int x=len1-len2;
            while(x-->0){
                headA=headA.next;
            }
        }
        if(len2>len1){
            int x=len2-len1;
            while(x-->0){
                headB=headB.next;
            }
        }
        while(headA!=null && headB!=null){
            if(headA==headB) return headA;
            headA=headA.next;
            headB=headB.next;
        }
        return null;
    }
}
