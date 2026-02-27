// https://www.geeksforgeeks.org/problems/level-order-traversal/1

/*
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        // code here
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        if(root==null) return list;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            ArrayList<Integer> l=new ArrayList<>();
            int len=q.size();
            for(int i=0;i<len;i++){
                Node curr=q.poll();
                l.add(curr.data);
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
            list.add(l);
        }
        return list;
    }
}
