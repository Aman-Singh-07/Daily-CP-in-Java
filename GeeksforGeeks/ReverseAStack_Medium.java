// https://www.geeksforgeeks.org/problems/reverse-a-stack/1?page=7&status=unsolved&sortBy=submissions

class Solution {
    public static void reverseStack(Stack<Integer> st) {
        // code here
        Queue<Integer> q=new LinkedList<>();
        while(!st.isEmpty()){
            q.add(st.pop());
        }
        while(!q.isEmpty()){
            st.push(q.poll());
        }
    }
}
