// https://www.geeksforgeeks.org/problems/maximum-path-sum-from-any-node/1
/*
class Node{
    int data;
    Node left, right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/

class Solution {
    static int max;
    int findMaxSum(Node root) {
        // code here
        max=Integer.MIN_VALUE;
        find(root);
        return max;
        
    }
    public static int find(Node root){
        if(root==null) return 0;
        int left=Math.max(0,find(root.left));
        int right=Math.max(0,find(root.right));
        max=Math.max(max,root.data+left+right);
        return Math.max(left,right)+root.data;
    }
}
