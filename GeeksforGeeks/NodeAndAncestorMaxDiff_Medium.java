// https://www.geeksforgeeks.org/problems/maximum-difference-between-node-and-its-ancestor/1

/* Structure of binary tree node
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
    int res=Integer.MIN_VALUE;
    int maxDiff(Node root) {
        //  code here
        find(root);
        return res;
    }
    
    int find(Node root){
        if(root==null) return Integer.MAX_VALUE;
        int left=find(root.left);
        int right=find(root.right);
        int min=Math.min(left,right);
        if(min!=Integer.MAX_VALUE) res=Math.max(res,root.data-min);
        
        return Math.min(root.data,min);
    }
}
