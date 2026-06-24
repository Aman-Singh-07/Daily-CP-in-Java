// https://leetcode.com/problems/binary-tree-right-side-view/description/

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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int len=q.size();
            for(int i=0;i<len-1;i++){
                TreeNode curr=q.poll();
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
            TreeNode curr=q.poll();
            if(curr!=null){ list.add(curr.val);
            if(curr.left!=null) q.add(curr.left);
            if(curr.right!=null) q.add(curr.right);}
        }
        return list;
    }
}
