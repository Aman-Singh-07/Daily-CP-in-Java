// https://www.geeksforgeeks.org/problems/clone-a-linked-list-with-next-and-random-pointer/1

/*
class Node {
    int data;
    Node next;
    Node random;

    Node(int x) {
        data = x;
        next = null;
        random = null;
    }
}
*/
class Solution {
    public Node cloneLinkedList(Node head) {
        // code here
        Node curr=head;
        while(curr!=null){
            Node newNode=new Node(curr.data);
            newNode.next=curr.next;
            curr.next=newNode;
            curr=newNode.next;
        }
        curr=head;
        while(curr!=null){
            if(curr.random!=null){
                curr.next.random=curr.random.next;
            }
            curr=curr.next.next;
        }
        Node ptr=head;
        Node temp=head.next;
        Node copy=temp;
        while(ptr!=null){
            ptr.next=ptr.next.next;
            if(copy.next!=null){
                copy.next=copy.next.next;
            }
            ptr=ptr.next;
            copy=copy.next;
        }
        return temp;
    }
}
