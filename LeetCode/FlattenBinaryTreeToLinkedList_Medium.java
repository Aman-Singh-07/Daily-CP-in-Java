// https://leetcode.com/problems/flatten-binary-tree-to-linked-list/?envType=problem-list-v2&envId=wqama0x5

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
    public void flatten(TreeNode root) {
        if (root == null) return;
        
        List<TreeNode> list = new ArrayList<>();
        preOrder(root, list);
        for (int i = 0; i < list.size() - 1; i++) {
            TreeNode current = list.get(i);
            TreeNode next = list.get(i + 1);
            
            current.left = null;   
            current.right = next;  
        }
    }
    
    public void preOrder(TreeNode node, List<TreeNode> list) {
        if (node == null) return;
        
        list.add(node);
        preOrder(node.left, list);
        preOrder(node.right, list);
    }
}
