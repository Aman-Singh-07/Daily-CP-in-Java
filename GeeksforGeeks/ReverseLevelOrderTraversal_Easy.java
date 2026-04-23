// https://www.geeksforgeeks.org/problems/reverse-level-order-traversal/1

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

class Tree {
    public ArrayList<Integer> reverseLevelOrder(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) return result;
        Queue<Node> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node curr = queue.poll();
            stack.push(curr.data);
            if (curr.right != null) {
                queue.add(curr.right);
            }
            if (curr.left != null) {
                queue.add(curr.left);
            }
        }

        while (!stack.isEmpty()) {
            result.add(stack.pop());
        }

        return result;
    }
}
