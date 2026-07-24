// https://www.geeksforgeeks.org/problems/pairwise-swap-elements-of-a-linked-list-by-swapping-data/1?page=5&status=unsolved&sortBy=submissions

/* Structure of linked list Node
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
};*/
class Solution {
    public Node pairwiseSwap(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = head.next;
        Node prev = null;
        Node curr = head;
        while (curr != null && curr.next != null) {
            Node nextPair = curr.next.next;
            Node second = curr.next;
            second.next = curr;
            curr.next = nextPair;
            if (prev != null) {
                prev.next = second;
            }
            prev = curr;
            curr = nextPair;
        }

        return newHead;
    }
}
