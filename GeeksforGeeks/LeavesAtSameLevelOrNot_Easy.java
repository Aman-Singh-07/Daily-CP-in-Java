// https://www.geeksforgeeks.org/problems/leaf-at-same-level/1?page=7&status=unsolved&sortBy=submissions

/* Definition for Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    int res=-1;
    public boolean check(Node root) {
        // code here
        return helper(root,0);
        
    } boolean helper(Node root, int lvl) {
        if(root==null) {
            return true;
        }
        
        if(root.left==null && root.right==null) {
            if(res == -1){
                res = lvl;
                return true;
            } else {
                if(res == lvl) return true;
                return false;
            }
        }
        
        boolean l = helper(root.left, lvl+1);
        boolean r = helper(root.right, lvl+1);
        
        return l && r;
    }
}
