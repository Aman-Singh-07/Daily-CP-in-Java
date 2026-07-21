// https://www.geeksforgeeks.org/problems/flattening-a-linked-list/1?page=3&status=unsolved&sortBy=submissions

/*
class Node {
	int data;
	Node next;
	Node bottom;
	
	Node(int x) {
		data = x;
		next = null;
		bottom = null;
	}
}
*/
class Solution {
	public Node flatten(Node root) {
		// code here
		PriorityQueue<Node>pq = new PriorityQueue<>((a, b)->a.data - b.data);
		Node temp = root;
		while (temp != null)
			{
			pq.add(temp);
			temp = temp.next;
		}
		Node dummy = new Node(0);
		Node curr = dummy;
		while (!pq.isEmpty())
			{
			Node min = pq.poll();
			curr.bottom = min;
			curr = curr.bottom;
			if (min.bottom != null)
				{
				pq.add(min.bottom);
			}
		}
		return dummy.bottom;
	}
}
