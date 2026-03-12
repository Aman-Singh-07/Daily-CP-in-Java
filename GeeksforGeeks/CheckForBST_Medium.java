// https://www.geeksforgeeks.org/problems/check-for-bst/1

/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public int min=Integer.MIN_VALUE;
    public boolean isBST(Node root) {
        // code here
        if(root==null) return true;
        if(isBST(root.left)==false) return false;
        if(root.data<=min) return false;
        min=root.data;
        return isBST(root.right);
    }
}
