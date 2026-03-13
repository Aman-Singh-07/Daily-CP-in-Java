// https://www.geeksforgeeks.org/problems/print-common-nodes-in-bst/1

class Solution {
    // Function to find the nodes that are common in both BST.
    public static ArrayList<Integer> findCommon(Node r1, Node r2) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        TreeSet<Integer> s1=new TreeSet<>();
        find1(r1,s1);
        find2(r2,s1,list);
        return list;
        
    }
    public static void find1(Node root,TreeSet<Integer> set){
        if(root==null) return;
        find1(root.left,set);
        set.add(root.data);
        find1(root.right,set);
    }
    public static void find2(Node root,TreeSet<Integer> s1,ArrayList<Integer> list){
        if(root==null) return;
        find2(root.left,s1,list);
        if(s1.contains(root.data)) list.add(root.data);
        find2(root.right,s1,list);
    }
}
