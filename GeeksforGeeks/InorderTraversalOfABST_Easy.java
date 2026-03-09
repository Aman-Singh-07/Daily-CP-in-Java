// https://www.geeksforgeeks.org/problems/inorder-traversal-of-a-bst/1

class Tree {
    // Function to return a list containing the inorder traversal of the BST.
    ArrayList<Integer> inOrder(Node root) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        addElement(root,list);
        return list;
    }
    public static void addElement(Node root,ArrayList<Integer> list){
        if(root==null) return;
        if(root.left!=null) addElement(root.left,list);
        list.add(root.data);
        if(root.right!=null) addElement(root.right,list);
    }
}
