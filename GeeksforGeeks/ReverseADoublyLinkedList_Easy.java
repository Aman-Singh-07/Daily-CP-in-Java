// https://www.geeksforgeeks.org/problems/reverse-a-doubly-linked-list/1?page=5&status=unsolved&sortBy=submissions

/*
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/

class Solution {
    public Node reverse(Node head) {
        if (head == null || head.next == null) return head;

        Node curr = head;
        Node temp = null;

        // Swap next and prev for all nodes
        while (curr != null) {
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev; // move to "next" (which is old prev)
        }

        // After loop, temp will be at the node before new head
        if (temp != null) {
            head = temp.prev;
        }

        return head;
    }
}
/*
class Solution {
    public Node reverse(Node head) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        Node ptr=head;
        while(ptr!=null){
            list.add(ptr.data);
            ptr=ptr.next;
        }
        ptr=head;
        int k=list.size()-1;
        while(ptr!=null){
            ptr.data=list.get(k);
            k--;
            ptr=ptr.next;
        }
        return head;
    }
} */
