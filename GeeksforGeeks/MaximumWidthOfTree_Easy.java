// https://www.geeksforgeeks.org/problems/maximum-width-of-tree/1

/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
} */

class Solution {
    int maxWidth(Node root) {
        //  code here
        int max=0;
        if(root==null) return max;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            max=Math.max(size,max);
            for(int i=0;i<size;i++){
                Node curr=q.poll();
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
        }
        return max;
    }
}
