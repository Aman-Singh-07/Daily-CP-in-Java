// https://www.geeksforgeeks.org/problems/size-of-doubly-linked-list--114556/1

// User function Template for Java
class Solution {
    public int findSize(Node head) {
        // Code Here
        int count=0;
        while(head!=null){
            head=head.next;
            count++;
        }
        return count;
    }
}
