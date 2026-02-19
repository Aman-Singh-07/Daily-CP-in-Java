/* Structure of node
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} */

class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int k) {
        // Your code here
        Node first=head;
        Node second=head;
        for(int i=0;i<k;i++){
            if(first==null) return -1;
            first=first.next;
        }
        while(first!=null){
            second=second.next;
            first=first.next;
        }
        return second.data;
    }
}
