// https://www.geeksforgeeks.org/problems/insertion-sort-list/1?page=1&difficulty=Medium&status=unsolved&sortBy=accuracy

/* Structure of linked list Node
class Node {
	public int val;
	public Node next;
	
	public Node(int x) {
		val = x;
		next = null;
	}
}; */
class Solution {
	public Node insertionSort(Node head) {
		// code here
		int n = 0;
		Node ptr = head;
		while (ptr != null) {
			ptr = ptr.next;
			n++;
		}
		
		int[] arr = new int[n];
		int i = 0;
		ptr = head;
		while (ptr != null) {
			arr[i] = ptr.val;
			ptr = ptr.next;
			i++;
		}
		
		for (i = 1; i < n; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				} else {
					break;
				}
			}
		}
		
		ptr=head;
		for(int num:arr){
		    ptr.val=num;
		    ptr=ptr.next;
		}
		return head;
		
	}
}
