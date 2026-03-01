// https://www.geeksforgeeks.org/problems/level-order-traversal-in-spiral-form/1

/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<Integer> findSpiral(Node root) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        if(root==null) return list;
        Stack<Node> stack1=new Stack<>();
        Stack<Node> stack2=new Stack<>();
        stack1.add(root);
        boolean in=true;
        while(!stack1.isEmpty() || !stack2.isEmpty()){
                while(!stack1.isEmpty()){
                    Node curr=stack1.pop();
                    list.add(curr.data);
                    if(curr.right!=null) stack2.push(curr.right);
                    if(curr.left!=null) stack2.push(curr.left);
                    
                }
                while(!stack2.isEmpty()){
                    Node curr=stack2.pop();
                    list.add(curr.data);
                    if(curr.left!=null) stack1.add(curr.left);
                    if(curr.right!=null) stack1.add(curr.right);
                    
                }
            
        }
        return list;
    }
}
