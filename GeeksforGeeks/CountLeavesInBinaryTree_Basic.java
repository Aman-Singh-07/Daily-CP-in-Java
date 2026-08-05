// https://www.geeksforgeeks.org/problems/count-leaves-in-binary-tree/1?page=5&status=unsolved&sortBy=submissions

/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
}*/

class Solution {
    public int count=0;
    int countLeaves(Node node) {
        // Your code
        if(node==null) return 0;
        if(node.left==null && node.right==null) return 1;
        return countLeaves(node.left) + countLeaves(node.right);
    }
}
