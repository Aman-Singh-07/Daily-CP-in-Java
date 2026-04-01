// https://leetcode.com/problems/binary-tree-postorder-traversal/description/?envType=problem-list-v2&envId=wqama0x5

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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        postOrder(root,list);
        return list;
    }
    public void postOrder(TreeNode root,List<Integer> list){
        if(root==null) return;
        if(root.left!=null) postOrder(root.left,list);
        if(root.right!=null) postOrder(root.right,list);
        list.add(root.val);
    }
}
