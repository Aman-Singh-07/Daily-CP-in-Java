// https://www.geeksforgeeks.org/problems/queue-reversal/1

class Solution {
    public void reverseQueue(Queue<Integer> q) {
        // code here
        if(q.isEmpty()) return;
        int x=q.poll();
        reverseQueue(q);
        q.offer(x);
    }
}
