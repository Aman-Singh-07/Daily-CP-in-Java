// https://www.geeksforgeeks.org/problems/binary-tree-to-dll/1

/*
class Node {
    int data;
    Node left, right;

    Node() {
        this.data = 0;
        this.left = this.right = null;
    }

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}
*/
class Solution {
    Node head=null;
    Node ptr=null;
    Node bToDLL(Node root) {
        // code here
        if(root==null) return null;
        bToDLL(root.left);
        if(ptr==null){
            head=root;
        }else{
            root.left=ptr;
            ptr.right=root;
            
        }
        ptr=root;
        bToDLL(root.right);
        return head;
        
    }
}
