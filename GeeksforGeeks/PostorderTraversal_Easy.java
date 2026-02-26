// https://www.geeksforgeeks.org/problems/postorder-traversal/1

/*
class Node {
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> postOrder(Node root) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        traverse(root,list);
        return list;
        
    }
    public void traverse(Node root,ArrayList<Integer> list){
        if(root==null) return;
        traverse(root.left,list);
        traverse(root.right,list);
        list.add(root.data);
    }
}
