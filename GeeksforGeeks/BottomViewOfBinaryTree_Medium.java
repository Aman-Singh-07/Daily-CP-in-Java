// https://www.geeksforgeeks.org/problems/bottom-view-of-binary-tree/1

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
        Node node;
        int hd;
        Pair(Node node,int hd){
            this.node=node;
            this.hd=hd;
        }
    }
    public ArrayList<Integer> bottomView(Node root) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        if(root==null) return list;
        Queue<Pair> q=new LinkedList<>();
        Map<Integer,Integer> map=new TreeMap<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair curr=q.poll();
            Node newNode=curr.node;
            int hd=curr.hd;
            map.put(hd,newNode.data);
            if(newNode.left!=null) q.add(new Pair(newNode.left,hd-1));
            if(newNode.right!=null) q.add(new Pair(newNode.right,hd+1));
        }
        for(int num:map.values()){
            list.add(num);
        }
        return list;
    }
}
