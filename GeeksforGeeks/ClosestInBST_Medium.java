// https://www.geeksforgeeks.org/problems/find-the-closest-element-in-bst/1

/*
class Node
{
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    // Function to find the least absolute difference between any node
    // value of the BST and the given integer.
    static int minDiff(Node root, int k) {
        // Write your code here
        Node curr=root;
        int res=Integer.MAX_VALUE;
        while(curr!=null){
            res=Math.min(res,Math.abs(k-curr.data));
            if(res==0) return 0;
            if(curr.data>k) curr=curr.left;
            else curr=curr.right;
        }
        return res;
        
        
        
    }
}
