// https://leetcode.com/problems/range-sum-of-bst/description

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int sum=0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        find(root,low, high );
        return sum;
    }
    public void find(TreeNode root, int l,int h){
        if(root==null) return;
        if(root.val<=h && root.val>=l) sum+=root.val;
        find(root.left,l,h);
        find(root.right,l,h);
        
    }
}
