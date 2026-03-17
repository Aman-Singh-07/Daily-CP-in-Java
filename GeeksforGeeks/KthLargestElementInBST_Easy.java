// https://www.geeksforgeeks.org/problems/kth-largest-element-in-bst/1?page=4&status=unsolved&sortBy=submissions

/*
class Node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data = data;
        left=null;
        right=null;
    }
}
*/
class Solution {
    static int result=-1;
    static int count=0;
    // return the Kth largest element in the given BST rooted at 'root'
    public int kthLargest(Node root, int k) {
        // Your code here
        count=0;
        result=-1;
        traverse(root,k);
        return result;
    }
    public static void traverse(Node root,int k){
        if(root==null || count>=k) return;
        traverse(root.right,k);
        count++;
        if(count==k){
            result=root.data;
            return;
        }
        traverse(root.left,k);
    }
}
