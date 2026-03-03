// https://www.geeksforgeeks.org/problems/foldable-binary-tree/1

/*
node class of the binary tree
class Node
{
    int data;
    Node left, right;
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}
*/
class Tree {
    // Function to check whether a binary tree is foldable or not.
    boolean IsFoldable(Node node) {
        // your code
        if(node==null) return true;
        return isMirror(node.left,node.right);
        
    }
    public static boolean isMirror(Node r1,Node r2){
        if(r1==null && r2==null) return true;
        if(r1==null || r2==null) return false;
        return  isMirror(r1.left,r2.right) && isMirror(r1.right,r2.left);
    }
}
