// https://www.geeksforgeeks.org/problems/lowest-common-ancestor-in-a-bst/1

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
    public Node LCA(Node root, Node n1, Node n2) {
        // code here
        if(root==null) return null;
        if(root==n1 || root==n2) return root;
        Node left=LCA(root.left,n1,n2);
        Node right=LCA(root.right,n1,n2);
        if(left!=null && right!=null) return root;
        if(left!=null) return left;
        else return right;
    }
}
