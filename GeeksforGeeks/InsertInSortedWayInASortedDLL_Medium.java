// https://www.geeksforgeeks.org/problems/insert-in-sorted-way-in-a-sorted-dll/1

/*class of the node of the DLL is as
/*
class Node {
    int data;
    Node prev, next;
    Node(int data) {
        this.data = data;
        this.prev = this.next = null;
    }
}
*/
class Solution {
    public Node sortedInsert(Node head, int x) {
        // add your code here
        Node ptr=head;
        Node n=new Node(x);
        if(ptr.data>x){
            n.next=ptr;
            ptr.prev=n;
            head=n;
        }
        else{
            while(ptr.next!=null && ptr.next.data<=x){
            ptr=ptr.next;
        }
        if(ptr.next==null){
            ptr.next=n;
            n.prev=ptr;
        }
        else{
            n.next=ptr.next;
            n.prev=ptr;
            ptr.next.prev=n;
            ptr.next=n;
            
        }
        }
        return head;
    }
}
