// https://www.geeksforgeeks.org/problems/convert-level-order-traversal-to-bst/1

class GFG {
    // Function to construct the BST from its given level order traversal.
    class NodeDetails{
        Node node;
        int min,max;
        NodeDetails(Node node,int min,int max){
            this.node=node;
            this.min=min;
            this.max=max;
        }
    }
    public Node constructBST(int[] arr) {
        // Write your code here
        int n=arr.length;
        if(n==0) return null;
        int i=0;
        Node root=new Node(arr[i++]);
        Queue<NodeDetails> q=new LinkedList<>();
        q.add(new NodeDetails(root,Integer.MIN_VALUE,Integer.MAX_VALUE));
        while(i<n && !q.isEmpty()){
            NodeDetails curr=q.poll();
            if(i<n && arr[i]<curr.node.data && arr[i]>curr.min){
                curr.node.left=new Node(arr[i]);
                q.add(new NodeDetails(curr.node.left,curr.min,curr.node.data));
                i++;
            }
            if(i<n && arr[i]>curr.node.data && arr[i]<curr.max){
                curr.node.right=new Node(arr[i]);
                q.add(new NodeDetails(curr.node.right,curr.node.data,curr.max));
                i++;
            }
            
        }
        return root;
        
        
    }
}
