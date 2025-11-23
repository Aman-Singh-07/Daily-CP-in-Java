// https://www.geeksforgeeks.org/problems/maximum-winning-score--170637/1?page=3&difficulty=Medium&status=unsolved&sortBy=accuracy

// Node class is assumed to be defined as:
// class Node {
//     int data;
//     Node left, right;
//     Node(int d) { data = d; left = right = null; }
// }

class Solution {
    public static Long findMaxScore(Node root) {
        if (root == null) return 1L; 
        if (root.left == null && root.right == null) {
            return (long) root.data;
        }
        long maxChild = Long.MIN_VALUE;
        if (root.left != null) {
            maxChild = Math.max(maxChild, findMaxScore(root.left));
        }
        if (root.right != null) {
            maxChild = Math.max(maxChild, findMaxScore(root.right));
        }
        return (long) root.data * maxChild;
    }
}
