// https://www.geeksforgeeks.org/problems/given-a-linked-list-of-0s-1s-and-2s-sort-it/1?page=3&status=unsolved&sortBy=submissions

/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        // code here
        int count0=0;
        int count1=0;
        int count2=0;
        Node ptr=head;
        while(ptr!=null){
            if(ptr.data==0) count0++;
            else if(ptr.data==1) count1++;
            else count2++;
            ptr=ptr.next;
        }
        ptr=head;
        while(count0>0){
            ptr.data=0;
            ptr=ptr.next;
            count0--;
        }
        while(count1>0){
            ptr.data=1;
            ptr=ptr.next;
            count1--;
        }
        while(count2>0){
            ptr.data=2;
            ptr=ptr.next;
            count2--;
        }
        return head;
    }
}
