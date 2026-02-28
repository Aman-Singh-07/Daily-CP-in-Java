// https://www.geeksforgeeks.org/problems/children-sum-parent/1

/*
class Node{
    int data;
    Node left,right;

    Node(int key)
    {
        data = key;
        left = right = null;
    }
}
*/
class Solution {
    public boolean isSumProperty(Node root) {
        //  code here
        if(root==null) return true;
        if(root.left==null && root.right==null) return true;
        int sum=0;
        if(root.left!=null) sum+=root.left.data;
        if(root.right!=null) sum+=root.right.data;
        return root.data==sum && isSumProperty(root.left) && isSumProperty(root.right);
    }
}
