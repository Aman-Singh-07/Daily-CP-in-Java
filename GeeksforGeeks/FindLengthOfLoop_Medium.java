// https://www.geeksforgeeks.org/problems/find-length-of-loop/1

/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public int lengthOfLoop(Node head) {
        // code here
        int len=0;
        Node slow=head;
        Node fast=head;
        boolean isTrue=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                isTrue=true;
                break;
            }
        }
        if(!isTrue) return 0;
        slow=slow.next;
        while(fast!=slow){
            slow=slow.next;
            len++;
        }
        return len+1;
    }
}
