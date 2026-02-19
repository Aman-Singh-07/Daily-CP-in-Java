// https://www.geeksforgeeks.org/problems/is-the-doubly-linked-list-circular/1

// User function Template for Java

/*class Node
{
    int data;
    Node next, prev;
    Node(int data)
    {
        this.data = data;
        this.next = this.prev = null;
    }
}*/

class Solution {
    public static boolean isCircular(Node head) {
        // your code here
        if(head==null) return true;
        Node ptr=head;
        while(ptr!=null){
            if(ptr.next==head) return true;
            ptr=ptr.next;
        }
        return false;
    }
};
