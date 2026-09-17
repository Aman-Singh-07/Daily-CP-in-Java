// https://leetcode.com/problems/reorder-list

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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        ArrayList<ListNode> list = new ArrayList<>();
        ListNode ptr = head;
        while (ptr != null) {
            list.add(ptr);
            ptr = ptr.next;
        }
        int i = 0;
        int j = list.size() - 1;
        
        while (i < j) {
            list.get(i).next = list.get(j);
            i++;
            if (i < j) {
                list.get(j).next = list.get(i);
                j--;
            }
        }
        list.get(i).next = null;
    }
}
