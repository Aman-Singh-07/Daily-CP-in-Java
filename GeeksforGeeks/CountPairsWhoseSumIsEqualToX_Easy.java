// https://www.geeksforgeeks.org/problems/count-pairs-whose-sum-is-equal-to-x/1?page=2&category=Linked%20List&status=unsolved&sortBy=submissions

// your task is to complete this function

/*class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    // Function to count pairs in two linked lists whose sum is equal to x
    public int countPairs(Node head1, Node head2, int x) {
        // add your code here
        HashSet<Integer> set=new HashSet<>();
        Node ptr2=head2;
        while(ptr2!=null){
            set.add(ptr2.data);
            ptr2=ptr2.next;
        }
        int count=0;
        Node ptr1=head1;
        while(ptr1!=null){
            if(set.contains(x-ptr1.data)) {
                count++;
            }
            ptr1=ptr1.next;
        }
        return count;
    }
}
