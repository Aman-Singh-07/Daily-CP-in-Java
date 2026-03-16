// https://www.geeksforgeeks.org/problems/fixed-two-nodes-of-a-bst/1

/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    static Node first,middle,last,prev;
    void correctBSTUtil(Node root) {
        // code here.
        if(root==null) return;
        correctBSTUtil(root.left);
        if(prev!=null && root.data<prev.data){
            if(first==null){
                first=prev;
                middle=root;
            }
            else last=root;
        }
        prev=root;
        correctBSTUtil(root.right);
    }
    
    void correctBST(Node root){
        first=middle=last=prev=null;
        correctBSTUtil(root);
        if(first!=null && last!=null) swap(first,last);
        else if(first!=null && middle!=null) swap(first,middle);
    }
    
    static void swap(Node a,Node b){
        int temp=a.data;
        a.data=b.data;
        b.data=temp;
    }
}
