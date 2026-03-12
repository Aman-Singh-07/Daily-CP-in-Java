// https://www.geeksforgeeks.org/problems/count-bst-nodes-that-lie-in-a-given-range/1

/*
class Node
{
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/
class Solution {
    public int count;
    int getCount(Node root, int l, int h) {
        // Your code here
        count=0;
        find(root,l,h);
        return count;
    }
    public void find(Node root,int l,int h){
        if(root==null) return;
        if(root.data>l) find(root.left,l,h);
        if(root.data>=l && root.data<=h) count++;
        if(root.data<h) find(root.right,l,h);
    }
}
