// https://www.geeksforgeeks.org/problems/levelorder-traversal-of-a-bst/1

class Solution {
    // Function to return the level order traversal of a BST.
    static ArrayList<Integer> levelOrder(Node root) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        Queue<Node> q=new LinkedList<>();
        if(root==null) return list;
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                Node curr=q.poll();
                list.add(curr.data);
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
        }
        return list;
    }
}
