//  https://www.geeksforgeeks.org/problems/leaf-under-budget/1

/* Binary Tree Node Structure
class Node {
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
    }
}
*/
class Solution {
    public int getCount(Node root, int k) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        find(root,1,list);
        Collections.sort(list);
        int count=0;
        for(int num:list){
            if(num>k) break;
            k-=num;
            count++;
        }
        return count;
    }
    public static void find(Node node, int depth, ArrayList<Integer> list){
        if(node==null) return;
        if(node.left==null && node.right==null){
            list.add(depth);
            return;
        }
        find(node.left, depth+1,list);
        find(node.right,depth+1,list);
    }
}
