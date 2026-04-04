// https://leetcode.com/problems/binary-tree-preorder-traversal/description/?envType=problem-list-v2&envId=wqama0x5

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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        preOrder(root,list);
        return list;
    }
    public static void preOrder(TreeNode root,List<Integer> list){
        if(root==null) return;
        list.add(root.val);
        if(root.left!=null) preOrder(root.left,list);
        if(root.right!=null) preOrder(root.right,list);
    }
}
