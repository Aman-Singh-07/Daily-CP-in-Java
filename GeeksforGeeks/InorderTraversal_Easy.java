// https://www.geeksforgeeks.org/problems/inorder-traversal/1

/*
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<Integer> inOrder(Node root) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        traverse(root,res);
        return res;
        
    }
    public void traverse(Node root,ArrayList<Integer> list){
        if(root==null) return;
        traverse(root.left,list);
        list.add(root.data);
        traverse(root.right,list);
    }
}
