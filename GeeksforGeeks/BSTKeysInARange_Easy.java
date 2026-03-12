// https://www.geeksforgeeks.org/problems/print-bst-elements-in-given-range/1

class Solution {
    // Function to return a list of BST elements in a given range.
    public static ArrayList<Integer> printNearNodes(Node root, int low, int high) {
        // code here.
        ArrayList<Integer> list=new ArrayList<Integer>();
        find(root,low,high,list);
        return list;
    }
    public static void find(Node root,int l,int h,ArrayList<Integer> list){
        if(root==null) return;
        if(root.data>l) find(root.left,l,h,list);
        if(root.data>=l && root.data<=h) list.add(root.data);
        if(root.data<h) find(root.right,l,h,list);
    }
}
