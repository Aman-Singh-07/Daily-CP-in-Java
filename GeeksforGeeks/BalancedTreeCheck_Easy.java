// https://www.geeksforgeeks.org/problems/check-for-balanced-tree/1

/*
class Node {
    int data;
    Node left, right;

    Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    public boolean isBalanced(Node root) {
        // code here
        if(root==null) return true;
        int left=height(root.left);
        int right=height(root.right);
        return Math.abs(left-right)<=1 && isBalanced(root.left) && isBalanced(root.right);
        
    }
    public int height(Node root){
        if(root==null) return -1;
        return Math.max(height(root.left),height(root.right))+1;
    }
}
