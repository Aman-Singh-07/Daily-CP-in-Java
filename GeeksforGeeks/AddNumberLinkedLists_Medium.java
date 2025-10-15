// https://www.geeksforgeeks.org/problems/add-two-numbers-represented-by-linked-lists/1?page=1&category=Linked%20List&status=unsolved&sortBy=submissions

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
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        ArrayList<Integer> list3=new ArrayList<>();
        Node ptr1=head1;
        Node ptr2=head2;
        while(ptr1!=null){
            list1.add(ptr1.data);
            ptr1=ptr1.next;
        }
        while(ptr2!=null){
            list2.add(ptr2.data);
            ptr2=ptr2.next;
        }
        int l=list1.size()-1;
        int m=list2.size()-1;
        int carry=0;
        while(l>=0 && m>=0){
            list3.add((list1.get(l)+list2.get(m)+carry)%10);
            carry=(list1.get(l)+list2.get(m)+carry)/10;
            l--;
            m--;
        }
        while(l>=0){
            list3.add((list1.get(l)+carry)%10);
            carry=(list1.get(l)+carry)/10;
            l--;
        }
        while(m>=0){
            list3.add((list2.get(m)+carry)%10);
            carry=(list2.get(m)+carry)/10;
            m--;
        }
        if(carry!=0) list3.add(carry);
        Node res=null;
        Node ptr=null;
        int z=list3.size()-1;
        for(int i=list3.size()-1;i>=0;i--){
            if(list3.get(i)!=0){
                z=i;
                break;
            }
        }
        for(int i=z;i>=0;i--){
            Node newNode=new Node(list3.get(i));
            if(res==null){
                res=newNode;
                ptr=res;
            }
            else{
                ptr.next=newNode;
                ptr=ptr.next;
            }
        }
        return res;
        
        
        
        
    }
}
