// https://leetcode.com/problems/rotate-list/description/?envType=daily-question&envId=2026-05-05

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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        int x = 0;
        ListNode temp = head;
        while (temp != null) {
            x++;
            temp = temp.next;
        }
        k = k % x;
        if (k == 0) {
            return head; 
        }
        temp = head;
        for (int i = 0; i < x - k - 1; i++) {
            temp = temp.next;
        }
        ListNode r = temp.next;
        ListNode res = r;
        while (res.next != null) {
            res = res.next;
        }
        res.next = head;
        temp.next = null;
        return r;
    }
}
