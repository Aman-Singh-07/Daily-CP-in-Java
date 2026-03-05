// https://www.geeksforgeeks.org/problems/connect-nodes-at-same-level/1

/*
   class Node{
       int data;
       Node left;
       Node right;
       Node nextRight;
       Node(int data){
           this.data = data;
           left=null;
           right=null;
           nextRight = null;
       }
   }

   */

class Solution {
    public Node connect(Node root) {
        // code here.
        if(root==null) return root;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            Node ptr=q.poll();
            if(ptr.left!=null) q.add(ptr.left);
            if(ptr.right!=null) q.add(ptr.right);
            for(int i=1;i<size;i++){
                Node curr=q.poll();
                ptr.nextRight=curr;
                ptr=curr;
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
            
        }
        return root;
        
    }
}
