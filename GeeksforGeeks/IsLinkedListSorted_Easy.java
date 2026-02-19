// https://www.geeksforgeeks.org/problems/is-linked-list-sorted/1

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    public boolean isSorted(Node head) {
        // code here
        Node ptr=head;
        boolean is1=false;
        boolean is2=false;
        while(ptr.next!=null){
            if(ptr.data>ptr.next.data) is1=true;
            if(ptr.data<ptr.next.data) is2=true;
            ptr=ptr.next;
        }
        return (is1 && is2)?false:true;
    }
}
