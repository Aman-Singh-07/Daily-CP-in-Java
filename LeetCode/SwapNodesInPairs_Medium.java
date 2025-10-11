// https://leetcode.com/problems/swap-nodes-in-pairs/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ArrayList<Integer> list=new ArrayList<>();
        ListNode ptr=head;
        while(ptr!=null){
            list.add(ptr.val);
            ptr=ptr.next;
        }
        for(int i=1;i<list.size();i+=2){
            int temp=list.get(i-1);
            list.set(i-1,list.get(i));
            list.set(i,temp);
        }
        ptr=head;
        int k=0;
        while(ptr!=null){
            ptr.val=list.get(k);
            k++;
            ptr=ptr.next;
        }
        return head;
    }
}
