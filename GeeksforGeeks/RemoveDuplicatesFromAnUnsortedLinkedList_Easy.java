//  https://www.geeksforgeeks.org/problems/remove-duplicates-from-an-unsorted-linked-list/1?page=4&status=unsolved&sortBy=submissions

/* The structure of linked list is the following
class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

import java.util.*;

class Solution {
    // Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) {
        if (head==null) return null;
        ArrayList<Integer> list=new ArrayList<>();
        Node ptr=head;
        while(ptr!=null){
            if(!list.contains(ptr.data)){
                list.add(ptr.data);
            }
            ptr=ptr.next;
        }
        ptr=head;
        int k=0;
        while(k<list.size()){
            ptr.data=list.get(k);
            k++;
            if(k==list.size()){
                ptr.next=null;
                break;
            }
            ptr=ptr.next;
        }

        return head;
    }
}
