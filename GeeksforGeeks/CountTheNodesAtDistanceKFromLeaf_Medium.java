// https://www.geeksforgeeks.org/problems/node-at-distance/1

// class Node
// {
//     int data;
//     Node left, right;

//     public Node(int d)
//     {
//         data = d;
//         left = right = null;
//     }
// }

class Solution {
    public static HashSet<Node> set;
    int kthFromLeaf(Node root, int k) {
        // code here
        set=new HashSet<>();
        ArrayList<Node> list=new ArrayList<>();
        Kth(root,list,k);
        return set.size();
    }
    
    public static void Kth(Node root,ArrayList<Node> list,int k){
        if(root==null) return;
        list.add(root);
        if(root.left==null && root.right==null){
            if(list.size()-1>=k){
                set.add(list.get(list.size()-1-k));
            }
        }
        Kth(root.left,list,k);
        Kth(root.right,list,k);
        list.remove(root);
    }
}
