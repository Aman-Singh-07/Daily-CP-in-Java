// https://www.geeksforgeeks.org/problems/diameter-of-binary-tree/1
 
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
} */

class Solution {
    static int maxDiameter;
    public int diameter(Node root) {
        // code here
        maxDiameter=0;
        height(root);
        return maxDiameter;
        
        
    }
    public int height(Node root){
        if(root==null) return 0;
        int left=height(root.left);
        int right=height(root.right);
        maxDiameter=Math.max(maxDiameter,left+right);
        return Math.max(left,right)+1;
    }
}
