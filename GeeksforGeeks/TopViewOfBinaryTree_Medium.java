// https://www.geeksforgeeks.org/problems/top-view-of-binary-tree/1

/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
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
    public ArrayList<Integer> topView(Node root) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        if(root==null) return list;
        Map<Integer,Integer> map=new TreeMap<>();
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair curr=q.poll();
            Node currNode=curr.node;
            int hd=curr.hd;
            if(!map.containsKey(hd)){
                map.put(hd,currNode.data);
            }
            if(currNode.left!=null) q.add(new Pair(currNode.left,hd-1));
            if(currNode.right!=null) q.add(new Pair(currNode.right,hd+1));
        }
        
        for(int num:map.values()){
            list.add(num);
        }
        return list;
    }
}
