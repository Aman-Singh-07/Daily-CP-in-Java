//  https://www.geeksforgeeks.org/problems/pair-sum-in-bst/1

// User function Template for Java

class GFG {
    // Function to check if any pair exists in BST
    // whose sum is equal to given value.
    static boolean findPair(Node root, int X) {
        // Your code
        HashSet<Integer> set=new HashSet<>();
        return find(root,X,set);
    }
    static boolean find(Node root, int X,HashSet<Integer> set) {
        // Your code
        if(root==null) return false;
        if((find(root.left,X,set))) return true;
        if(set.contains(X-root.data)) return true;
        set.add(root.data);
        return find(root.right,X,set);
    }
}
