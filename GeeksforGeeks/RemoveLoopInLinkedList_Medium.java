// https://www.geeksforgeeks.org/problems/remove-loop-in-linked-list/1

/*
class Node
{
    int data;
    Node next;
}
*/

class Solution {
    public static void removeLoop(Node head) {
        // code here
        Node slow=head;
        Node fast=head;
        boolean isTrue=false;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                isTrue=true;
                break;
            }
        }
        if(isTrue){
            slow=head;
            while(slow!=fast){
                slow=slow.next;
                fast=fast.next;
            }
            while(slow.next!=fast){
                slow=slow.next;
            }
            slow.next=null;
        }
    }
}
