// https://leetcode.com/problems/minimum-depth-of-binary-tree/description/?envType=problem-list-v2&envId=wqama0x5

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
    public class pair{
        int depth;
        TreeNode root;
        pair(TreeNode root,int depth){
            this.depth=depth;
            this.root=root;
        }
    }
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        Queue<pair> queue=new LinkedList<>();
        queue.add(new pair(root,1));
        while(!queue.isEmpty()){
            pair p=queue.poll();
            int depth=p.depth;
            TreeNode newRoot=p.root;
            if(newRoot.left==null && newRoot.right==null) return depth;
            if(newRoot.left!=null) queue.add(new pair(newRoot.left,depth+1));
            if(newRoot.right!=null) queue.add(new pair(newRoot.right,depth+1));
        }
        return 0;
        
    }
}
