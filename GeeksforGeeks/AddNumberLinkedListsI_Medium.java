// https://www.geeksforgeeks.org/problems/add-two-numbers-represented-by-linked-lists/1

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
    public Node addTwoLists(Node head1, Node head2) {
        // code here
        Node prev1=null;
        Node prev2=null;
        Node curr1=head1;
        Node curr2=head2;
        while(curr1!=null){
            Node newNode=curr1.next;
            curr1.next=prev1;
            prev1=curr1;
            curr1=newNode;
        }
        while(curr2!=null){
            Node newNode=curr2.next;
            curr2.next=prev2;
            prev2=curr2;
            curr2=newNode;
        }
        int carry=0;
        Node res=null;
        while(prev1!=null || prev2!=null || carry!=0){
            int sum=carry;
            if(prev1!=null){
                sum+=prev1.data;
                prev1=prev1.next;
            }
            if(prev2!=null){
                sum+=prev2.data;
                prev2=prev2.next;
            }
            Node newNode=new Node(sum%10);
            carry=sum/10;
            newNode.next=res;
            res=newNode;
        }
        while(res!=null && res.next!=null && res.data==0){
            res=res.next;
        }
        return res;
    }
}
