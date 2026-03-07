// https://www.geeksforgeeks.org/problems/construct-binary-tree-from-parent-array/1


/*
class Node {
    int data;
    Node left, right;
    Node(int x) {
        data = x;
        left = right = null;
    }
}
*/
class Solution {
    Node createTree(int[] parent) {
        // code here
        int n=parent.length;
        Node[] nodes=new Node[n];
        Node root=null;
        for(int i=0;i<n;i++){
            nodes[i]=new Node(i);
        }
        for(int i=0;i<n;i++){
            if(parent[i]==-1) root=nodes[i];
            else{
                Node p=nodes[parent[i]];
                if(p.left==null) p.left=nodes[i];
                else p.right=nodes[i];
            }
        }
        return root;
        
    }
}
