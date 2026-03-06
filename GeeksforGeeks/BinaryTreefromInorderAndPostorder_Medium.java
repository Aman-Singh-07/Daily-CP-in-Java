//  https://www.geeksforgeeks.org/problems/tree-from-postorder-and-inorder/1

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
    static int postIdx;
    static HashMap<Integer,Integer> map;
    Node buildTree(int[] inorder, int[] postorder) {
        // code here
        map=new HashMap<>();
        postIdx=postorder.length-1;
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return builder(inorder,postorder,0,inorder.length-1);
    }
    Node builder(int[] in,int[] post,int start,int end){
        if(start>end) return null;
        Node root=new Node(post[postIdx]);
        postIdx--;
        int idx=map.get(root.data);
        root.right=builder(in,post,idx+1,end);
        root.left=builder(in,post,start,idx-1);
        return root;
    }
}
