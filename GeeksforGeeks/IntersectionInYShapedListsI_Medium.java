// https://www.geeksforgeeks.org/problems/intersection-point-in-y-shapped-linked-lists/1

/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    public Node intersectPoint(Node head1, Node head2) {
        // code here
        Node ptr1=head1;
        Node ptr2=head2;
        int count1=0;
        int count2=0;
        while(ptr1!=null){
            ptr1=ptr1.next;
            count1++;
        }
        while(ptr2!=null){
            ptr2=ptr2.next;
            count2++;
        }
        if(count1>count2){
            for(int i=0;i<count1-count2;i++){
                head1=head1.next;
            }
        }else{
            for(int i=0;i<count2-count1;i++){
                head2=head2.next;
            }
        }
        ptr1=head1;
        ptr2=head2;
        while(ptr1!=ptr2){
            ptr1=ptr1.next;
            ptr2=ptr2.next;
        }
        return ptr1;
    }
}
