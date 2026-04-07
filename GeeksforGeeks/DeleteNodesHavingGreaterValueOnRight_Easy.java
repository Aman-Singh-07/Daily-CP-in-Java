// https://www.geeksforgeeks.org/problems/delete-nodes-having-greater-value-on-right/1?page=5&status=unsolved&sortBy=submissions

/*
class Node {
   int data;
   Node next;

  Node(int data) {
      this.data = data;
  }
}
*/
class Solution {
    Node compute(Node head) {
        if (head == null || head.next == null) return head;
        head = reverseList(head);
        Node curr = head;
        Node maxNode = head; 

        while (curr != null && curr.next != null) {
            if (curr.next.data < maxNode.data) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
                maxNode = curr;
            }
        }

        head = reverseList(head);

        return head; 
    }

    Node reverseList(Node head) {
        Node prev = null;
        Node curr = head;
        
        while (curr != null) {
            Node nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        
        return prev;
    }
}
