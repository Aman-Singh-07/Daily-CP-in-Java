// https://leetcode.com/problems/create-binary-tree-from-descriptions/description/?envType=daily-question&envId=2026-06-07

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
    public TreeNode createBinaryTree(int[][] descriptions) {
        HashMap<Integer,TreeNode> map=new HashMap<>();
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<descriptions.length;i++){
            int nodeVal=descriptions[i][0];
            int childVal=descriptions[i][1];
            int left=descriptions[i][2]==1?1:0;
            map.putIfAbsent(nodeVal,new TreeNode(nodeVal));
            map.putIfAbsent(childVal,new TreeNode(childVal));
            if(left==1){
                map.get(nodeVal).left=map.get(childVal);
            }
            else map.get(nodeVal).right=map.get(childVal);
            set.add(childVal);
        }

        for(int[] des:descriptions){
            int val=des[0];
            if(!set.contains(val)){
                return map.get(val);
            }
        }
        return null;

    }
}
