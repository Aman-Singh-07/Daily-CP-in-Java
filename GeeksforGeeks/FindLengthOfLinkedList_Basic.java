// https://www.geeksforgeeks.org/problems/count-nodes-of-linked-list/1?page=4&status=unsolved&sortBy=submissions

/*
class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}*/

class Solution {
    public int getCount(Node head) {
        // code here
        Node ptr=head;
        if(head==null){
            return 0;
        }
        int count=1;
        while(ptr.next!=null){
            count++;
            ptr=ptr.next;
        }
        return count;
    }
}
