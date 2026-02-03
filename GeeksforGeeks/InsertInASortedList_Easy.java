// https://www.geeksforgeeks.org/problems/insert-in-a-sorted-list/1?page=8&status=unsolved&sortBy=submissions

class Solution {
    Node sortedInsert(Node head, int key) {
        Node newNode = new Node(key);
        if(head==null || key<head.data){
            newNode.next=head;
            return newNode;
        }
        Node curr=head;
        while(curr.next != null && curr.next.data<key){
            curr=curr.next;
        }
        newNode.next=curr.next;
        curr.next=newNode;

        return head;
    }
}
