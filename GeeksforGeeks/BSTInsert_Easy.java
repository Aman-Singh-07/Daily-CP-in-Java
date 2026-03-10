// https://www.geeksforgeeks.org/problems/insert-a-node-in-a-bst/1

/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public Node insert(Node root, int key) {
        // code here
        Node curr=root;
        Node parent=null;
        while(curr!=null){
            parent=curr;
            if(curr.data<key) curr=curr.right;
            else if(curr.data>key) curr=curr.left;
            else return root;
        }
        if(parent==null){
            return new Node(key);
        }
        Node x=new Node(key);
        if(parent.data<key) parent.right=x;
        else parent.left=x;
        return root;
        
    }
}
