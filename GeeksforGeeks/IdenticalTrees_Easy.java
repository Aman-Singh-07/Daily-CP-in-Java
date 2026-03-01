// https://www.geeksforgeeks.org/problems/determine-if-two-trees-are-identical/1

/*
class Node{
    int data;
    Node left, right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/

class Solution {
    public boolean isIdentical(Node r1, Node r2) {
        // code here
        if(r1==null && r2==null) return true;
        if(r1==null || r2==null) return false;
        int curr1=r1.data;
        int curr2=r2.data;
        return curr1==curr2 && isIdentical(r1.left,r2.left) && isIdentical(r1.right,r2.right);
    }
}
