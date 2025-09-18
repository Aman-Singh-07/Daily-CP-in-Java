// https://www.geeksforgeeks.org/problems/search-in-linked-list-1664434326/1?page=4&difficulty=Easy&status=unsolved&sortBy=submissions

/*
  class Node {
   int data;
    Node next;

    Node(int d)  { data = d;  next = null; }
}
*/
class Solution {
    public boolean searchKey(Node head, int key) {
        // Code here
        while(head!=null){
            if(head.data==key){
                return true;
            }
            head=head.next;
        }
        return false;
    }
}
