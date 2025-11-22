// https://www.geeksforgeeks.org/problems/modify-linked-list-1-0546/1?page=3&difficulty=Medium&status=unsolved&sortBy=accuracy

class Solution {
    public static Node modifyTheList(Node head) {
        ArrayList<Integer> list = new ArrayList<>();
        Node ptr = head;
        while(ptr != null){
            list.add(ptr.data);
            ptr = ptr.next;
        }

        int n = list.size();
        ArrayList<Integer> copy = new ArrayList<>();
        for(int i = 0; i < n/2; i++){
            copy.add(list.get(i));
        }

        for(int i = 0; i < n/2; i++){
            list.set(i, list.get(n-1-i) - list.get(i));
        }

        for(int i = n/2; i < n; i++){
            if(n % 2 == 1 && i == n/2) continue; 
            list.set(i, copy.get(n-1-i));
        }

        ptr = head;
        for(int i = 0; i < n; i++){
            ptr.data = list.get(i);
            ptr = ptr.next;
        }

        return head;
    }
}
