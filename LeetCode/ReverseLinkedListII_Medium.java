// https://leetcode.com/problems/reverse-linked-list-ii/description/?envType=problem-list-v2&envId=wqama0x5

class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right){
            return head;
        }
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
        for(int i=0;i<left-1;i++){
            prev=prev.next;
        }
        ListNode curr=prev.next; 
        for(int i=0;i<right-left;i++){
            ListNode nextTemp=curr.next; 
            curr.next=nextTemp.next;     
            nextTemp.next=prev.next;     
            prev.next=nextTemp;          
        }
        return dummy.next;
    }
}
