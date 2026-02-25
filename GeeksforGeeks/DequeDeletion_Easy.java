// https://www.geeksforgeeks.org/problems/deque-deletion/1

class Solution {
    public static void eraseAt(ArrayDeque<Integer> deq, int x) {
        // code here
        int size=deq.size();
        for(int i=0;i<x;i++){
            deq.add(deq.poll());
        }
        deq.poll();
        for(int i=x+1;i<size;i++){
            deq.add(deq.poll());
        }
        
    }

    public static void eraseInRange(ArrayDeque<Integer> deq, int x, int y) {
        // code here
        int size=deq.size();
        for(int i=0;i<x;i++){
            deq.add(deq.poll());
        }
        for(int i=x;i<y;i++) deq.poll();
        for(int i=y;i<size;i++){
            deq.add(deq.poll());
        }
        
    }

        
    public static void eraseAll(ArrayDeque<Integer> deq) {
        // code here
        deq.clear();
    }
}
