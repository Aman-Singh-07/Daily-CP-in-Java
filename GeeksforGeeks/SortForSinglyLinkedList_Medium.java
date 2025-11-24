// https://www.geeksforgeeks.org/problems/insertion-sort-for-singly-linked-list/1?page=4&difficulty=Medium&status=unsolved&sortBy=accuracy

// User function Template for Java

/*class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    */
// class Solution {
//     public static Node insertionSort(Node head_ref) {
//         // code here
//         ArrayList<Integer> list=new ArrayList<>();
//         Node ptr=head_ref;
//         while(ptr!=null){
//             list.add(ptr.data);
//             ptr=ptr.next;
//         }
//         Collections.sort(list);
//         ptr=head_ref;
//         for(int num:list){
//             ptr.data=num;
//             ptr=ptr.next;
//         }
//         return head_ref;
//     }
// }

class Solution {
    public static Node insertionSort(Node head_ref) {
        if (head_ref == null || head_ref.next == null) return head_ref;

        Node sorted = null;

        Node current = head_ref;
        while (current != null) {
            Node next = current.next;
            sorted = sortedInsert(sorted, current);
            current = next;
        }
        return sorted;
    }
    private static Node sortedInsert(Node head, Node newNode) {
        if (head == null || head.data >= newNode.data) {
            newNode.next = head;
            return newNode;
        } else {
            Node current = head;
            while (current.next != null && current.next.data < newNode.data) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
            return head;
        }
    }
}
