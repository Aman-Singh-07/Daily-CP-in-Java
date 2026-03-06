// https://www.geeksforgeeks.org/problems/print-a-binary-tree-in-vertical-order/1

/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    static class Pair{
        int hd;
        Node node;
        Pair(Node node,int hd){
            this.node=node;
            this.hd=hd;
        }
    }
    public ArrayList<ArrayList<Integer>> verticalOrder(Node root) {
        // code here
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        if(root==null) return res;
        TreeMap<Integer,ArrayList<Integer>> map=new TreeMap<>();
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair curr=q.poll();
            Node currNode=curr.node;
            int hd=curr.hd;
            map.putIfAbsent(hd,new ArrayList<>());
            map.get(hd).add(currNode.data);
            if(currNode.left!=null) q.add(new Pair(currNode.left,hd-1));
            if(currNode.right!=null) q.add(new Pair(currNode.right,hd+1));
        }
        for(ArrayList<Integer> l:map.values()){
            res.add(l);
        }
        return res;
    }
}
