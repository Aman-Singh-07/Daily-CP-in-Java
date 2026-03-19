// https://www.geeksforgeeks.org/batch/problems/preorder-to-postorder4423/1

// User function Template for Java

/*
class Node {
    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    // Function that constructs BST from its preorder traversal.
    int[] idx=new int[]{0};
    public Node Bst(int pre[], int size) {
        // code here
        idx[0]=0;
        return buildTree(pre,Integer.MAX_VALUE);
        
    }
    public Node buildTree(int[] pre,int bound){
        if(idx[0]==pre.length || pre[idx[0]]>bound){
            return null;
        }
        Node root=new Node(pre[idx[0]++]);
        root.left=buildTree(pre,root.data);
        root.right=buildTree(pre,bound);
        return root;
    }
}
