// https://www.geeksforgeeks.org/problems/delete-without-head-pointer/1?page=1&category=Arrays,Linked%20List&difficulty=Medium&status=unsolved&sortBy=submissions

/*
class Node
{
    int data ;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
*/

class Solution {
    public void deleteNode(Node del_node) {
        if(del_node==null || del_node.next==null){
            return;
        }
        del_node.data=del_node.next.data;  
        del_node.next=del_node.next.next;   
    }
}
