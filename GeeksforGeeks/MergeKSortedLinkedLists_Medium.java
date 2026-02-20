// https://www.geeksforgeeks.org/problems/merge-k-sorted-linked-lists/1

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
    Node mergeKLists(Node[] arr) {
        // code here
        if(arr==null || arr.length==0) return null;
        Node res=arr[0];
        for(int i=1;i<arr.length;i++){
            res=merger(res,arr[i]);
        }
        return res;
    }
    
    public Node merger(Node a,Node b){
        Node temp=new Node(0);
        Node tail=temp;
        while(a!=null && b!=null){
            if(a.data<=b.data){
                tail.next=a;
                a=a.next;
            }else{
                tail.next=b;
                b=b.next;
            }
            tail=tail.next;
        }
        if(a!=null) tail.next=a;
        if(b!=null) tail.next=b;
        return temp.next;
    }
}
