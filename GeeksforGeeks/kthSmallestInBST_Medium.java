// https://www.geeksforgeeks.org/problems/find-k-th-smallest-element-in-bst/1?page=5&status=unsolved&sortBy=submissions

/*
class Node {
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    public int kthSmallest(Node root, int k) {
        // code here
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
        ArrayList<Integer> list=new ArrayList<>();
        preOrder(root,list);
        if(list.size()<k) return -1;
        for(int i=0;i<Math.min(list.size(),k);i++){
            maxHeap.add(list.get(i));
        }
        for(int i=k;i<list.size();i++){
            if(list.get(i)<=maxHeap.peek()){
                maxHeap.poll();
                maxHeap.add(list.get(i));
            }
        }
        return maxHeap.peek();
    }
    public static void preOrder(Node root,ArrayList<Integer> list){
        if(root==null) return;
        list.add(root.data);
        if(root.left!=null) preOrder(root.left,list);
        if(root.right!=null) preOrder(root.right,list);
    }
}
