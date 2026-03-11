// https://www.geeksforgeeks.org/problems/implementing-ceil-in-bst/1

/* class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
} */

class Solution {
    int findCeil(Node root, int x) {
        // code here
        if(root==null) return -1;
        int res=-1;
        while(root!=null){
            if(root.data==x) return x;
            if(root.data<x) root=root.right;
            else if(root.data>x){
                res=root.data;
                root=root.left;
            }
        }
        return res;
    }
}
