// https://www.geeksforgeeks.org/problems/left-view-of-binary-tree/1

/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> leftView(Node root) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        if(root==null) return list;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                Node curr=q.poll();
                if(i==0){
                    list.add(curr.data);
                }
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
        }
        return list;
        
    }
}
