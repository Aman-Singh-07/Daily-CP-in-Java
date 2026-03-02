// https://www.geeksforgeeks.org/problems/make-binary-tree/1

/*
class NodeLL {
    int data;
    NodeLL next;

    NodeLL(int x) {
        data = x;
        next = null;
    }
}

class Node {
    int data;
    Node left, right;

    Node(int x) {
        data = x;
        left = right = null;
    }
}
*/
class Solution {
    public Node linkedListToBinaryTree(NodeLL head) {
        // code here
        if(head==null) return null;
        Node root=new Node(head.data);
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        NodeLL ptr=head.next;
        while(ptr!=null){
            Node newNode=q.poll();
            
            Node leftChild=new Node(ptr.data);
            newNode.left=leftChild;
            q.add(leftChild);
            ptr=ptr.next;
            if(ptr!=null){
                Node rightChild=new Node(ptr.data);
                newNode.right=rightChild;
                q.add(rightChild);
                ptr=ptr.next;
            }
        }
        return root;
        
    }
}
