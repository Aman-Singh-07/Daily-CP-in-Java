// https://leetcode.com/problems/find-the-minimum-and-maximum-number-of-nodes-between-critical-points/?envType=daily-question&envId=2026-08-31

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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return new int[]{-1, -1};
        }

        int firstCriticalIndex = -1;
        int lastCriticalIndex = -1;
        int prevCriticalIndex = -1;
        
        int minDistance = Integer.MAX_VALUE;
        int currentIndex = 1;
        
        ListNode prev = head;
        ListNode curr = head.next;

        while (curr.next != null) {
            ListNode nextNode = curr.next;
            boolean isLocalMaxima = curr.val > prev.val && curr.val > nextNode.val;
            boolean isLocalMinima = curr.val < prev.val && curr.val < nextNode.val;

            if (isLocalMaxima || isLocalMinima) {
                if (firstCriticalIndex == -1) {
                    firstCriticalIndex = currentIndex;
                } else {
                    minDistance = Math.min(minDistance, currentIndex - prevCriticalIndex);
                }
                
                prevCriticalIndex = currentIndex;
                lastCriticalIndex = currentIndex;
            }
            prev = curr;
            curr = nextNode;
            currentIndex++;
        }
        if (firstCriticalIndex == lastCriticalIndex) {
            return new int[]{-1, -1};
        }
        int maxDistance = lastCriticalIndex - firstCriticalIndex;

        return new int[]{minDistance, maxDistance};
    }
}
