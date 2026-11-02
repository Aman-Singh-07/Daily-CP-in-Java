// https://www.geeksforgeeks.org/problems/root-to-leaf-path-sum/1

/* A Binary Tree node
class Node {
	int data;
	Node left;
	Node right;
	Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}
*/

class Solution {
    public int sum;
	boolean hasPathSum(Node root, int target) {
		// code here
		if(root==null) return false;
		if(root.left==null && root.right==null){
		    return root.data==target;
		}
		target-=root.data;
		boolean left=hasPathSum(root.left,target);
		boolean right=hasPathSum(root.right,target);
		return (left || right);
	}
}
