// https://www.codechef.com/problems/LLCYCLE

// class Node {
//     int val;
//     Node next;
//     Node(int val) {
//         this.val = val;
//         this.next = null;
//     }
// }



public static int detectCycle(Node head) {
    //write your code here...
     if (head == null || head.next == null) {
        return -1;
    }
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
    if(!isTrue) return -1;
    int idx=0;
    Node ptr=head;
    while(ptr!=slow){
        ptr=ptr.next;
        slow=slow.next;
        idx++;
    }
    return idx;
}
