// https://www.geeksforgeeks.org/problems/merge-two-bst-s/1

/*
class Node {
    int data;
    Node left, right;

    public Node(int val)
    {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> merge(Node root1, Node root2) {
        // code here
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();
        find(root1,l1);
        find(root2,l2);
        ArrayList<Integer> res=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<l1.size() && j<l2.size()){
            if(l1.get(i)<=l2.get(j)){
                res.add(l1.get(i));
                i++;
            }else{
                res.add(l2.get(j));
                j++;
            }
        }
        while(i<l1.size()){
            res.add(l1.get(i));
            i++;
        }
        while(j<l2.size()){
            res.add(l2.get(j));
            j++;
        }
        return res;
    }
    public static void find(Node root,ArrayList<Integer> list){
        if(root==null) return;
        find(root.left,list);
        list.add(root.data);
        find(root.right,list);
    }
}
