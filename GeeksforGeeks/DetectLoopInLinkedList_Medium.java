// https://www.geeksforgeeks.org/problems/detect-loop-in-linked-list/1?page=1&category=Linked%20List&status=unsolved&sortBy=submissions

/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public boolean detectLoop(Node head) {
        // code here
        HashSet<Node> set=new HashSet<>();
        Node ptr=head;
        while(!set.contains(ptr) && ptr!=null){
            set.add(ptr);
            ptr=ptr.next;
        }
        return ptr!=null;
    }
}
