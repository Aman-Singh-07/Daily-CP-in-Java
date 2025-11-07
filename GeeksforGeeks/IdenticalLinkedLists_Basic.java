// https://www.geeksforgeeks.org/problems/identical-linked-lists/1?page=6&status=unsolved&sortBy=submissions

/*
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}*/
class Solution {
    public boolean areIdentical(Node head1, Node head2) {
        // code here
        Node ptr1=head1;
        Node ptr2=head2;
        while(ptr1!=null || ptr2!=null){
            if(ptr1==null) return false;
            if(ptr2==null) return false;
            if(ptr1.data!=ptr2.data) return false;
            ptr1=ptr1.next;
            ptr2=ptr2.next;
        }
        return true;
    }
}
