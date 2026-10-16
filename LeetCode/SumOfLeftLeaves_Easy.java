// https://leetcode.com/problems/sum-of-left-leaves/description/

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
    public int res=0;
    public int sumOfLeftLeaves(TreeNode root) {
        res=0;
        sum(root);
        return res;
    }

    public void sum(TreeNode root){
        if(root==null) return;
        if(root.left!=null){
            if(root.left.left==null && root.left.right==null) res+=root.left.val;
        }
        sum(root.left);
        sum(root.right);
    }
}
