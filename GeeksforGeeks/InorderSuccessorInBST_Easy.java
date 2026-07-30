// https://www.geeksforgeeks.org/problems/inorder-successor-in-bst/1?page=5&status=unsolved&sortBy=submissions

/*
Definition for Node
class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int val) {
        data = val;
        left = right = null;
    }
};
*/

class Solution {
    Node successor=null;
    public int inOrderSuccessor(Node root, Node k) {
        // code here
        while(root!=null){
            if(k.data>=root.data){
                root=root.right;
            }else{
                successor=root;
                root=root.left;
            }
        }

        return (successor!=null)?successor.data:-1;
        
    }
}
