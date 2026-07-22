// https://leetcode.com/problems/sum-root-to-leaf-numbers/description/ 

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
    public int sumNumbers(TreeNode root) {
        return find(0,root);
        
    }
    public int find(int res,TreeNode root){
          if(root==null){
            return 0;
          }
          res=res*10+root.val;
          if(root.left==null && root.right==null){
            return res;
          }
          int left=find(res,root.left);
          int right=find(res,root.right);
          return left+right;
          
    }
}
