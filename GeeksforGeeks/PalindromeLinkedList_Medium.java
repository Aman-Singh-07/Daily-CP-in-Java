// https://www.geeksforgeeks.org/problems/check-if-linked-list-is-pallindrome/1?page=1&category=Linked%20List&difficulty=Medium&status=unsolved&sortBy=submissions

/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    public boolean isPalindrome(Node head) {
        ArrayList<Integer> list = new ArrayList<>();
        Node ptr = head;
        while(ptr != null){
            list.add(ptr.data);
            ptr = ptr.next;
        }
        int i = 0, j = list.size() - 1;
        while(i < j){
            if (!list.get(i).equals(list.get(j))) return false;
            i++;
            j--;
        }
        return true;
    }
}
