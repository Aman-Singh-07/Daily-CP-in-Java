// https://www.geeksforgeeks.org/problems/vertical-width-of-a-binary-tree/1

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
    public int verticalWidth(Node root) {
        // code here.
        if(root==null) return 0;
        HashSet<Integer> set=new HashSet<>();
        calculate(root,0,set);
        return set.size();
    }
    public static void calculate(Node root,int num,HashSet<Integer> set){
        if(root==null) return;
        set.add(num);
        calculate(root.left,num-1,set);
        calculate(root.right,num+1,set);
        
    }
}
