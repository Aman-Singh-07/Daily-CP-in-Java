// https://www.geeksforgeeks.org/problems/count-number-of-subtrees-having-given-sum/1

/*class Node
{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}*/

class Solution {
    static int count;
    int countSubtrees(Node root, int x) {
        //  code here.
        count=0;
        countSubtreesSum(root,x);
        return count;
    }
    public static int countSubtreesSum(Node root,int x){
        if(root==null) return 0;
        int left=countSubtreesSum(root.left,x);
        int right=countSubtreesSum(root.right,x);
        int res=root.data+left+right;
        if(res==x) count++;
        
        return res;
    }
}
