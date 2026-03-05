// https://www.geeksforgeeks.org/problems/maximum-difference-between-node-and-its-ancestor/1

/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class Solution {
    static int diff;
    int maxDiff(Node root) {
        //  code here
        diff=Integer.MIN_VALUE;
        findMin(root);
        return diff;
        
    }
    public static int findMin(Node root){
        if(root==null) return Integer.MAX_VALUE;
        if(root.left==null && root.right==null) return root.data;
        int left=findMin(root.left);
        int right=findMin(root.right);
        int min=Math.min(left,right);
        int d=root.data-min;
        diff=Math.max(d,diff);
        return Math.min(root.data,min);
    }
}
