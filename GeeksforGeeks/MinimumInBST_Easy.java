// https://www.geeksforgeeks.org/problems/minimum-element-in-bst/1

/*
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
    public int minValue(Node root) {
        // code here
        int min=-1;
        while(root!=null){
            min=root.data;
            root=root.left;
        }
        return min;
        
    }
}
