// https://www.geeksforgeeks.org/problems/check-if-subtree/1

/*complete the given function*/

/* class Node{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=null;
        right=null;
    }
}*/

class Solution {
    public static boolean isSubtree(Node T, Node S) {
        // add code here.
        if(T==null) return false;
        if(S==null) return true;
        if(isIdentical(T,S)) return true;
        return isSubtree(T.left,S) || isSubtree(T.right,S);
    }
    public static boolean isIdentical(Node T,Node S){
        if(T==null && S==null) return true;
        if(T==null || S==null) return false;
        return T.data==S.data && isIdentical(T.left,S.left) && isIdentical(T.right,S.right);
    }
}
