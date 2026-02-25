// https://www.geeksforgeeks.org/problems/deque-implementations/1

class Solution {
    public static void pb(ArrayDeque<Integer> dq, int x) {
        //  code here
        dq.offerLast(x);
    }

    public static void ppb(ArrayDeque<Integer> dq) {
        //  code here
        if(!dq.isEmpty()) dq.pollLast();
    }

        
    public static int front_dq(ArrayDeque<Integer> dq) {
        //  code here
        if(dq.isEmpty()) return -1;
        return dq.peekFirst();
    }
        

    public static void pf(ArrayDeque<Integer> dq, int x) {
        //  code here
        dq.offerFirst(x);
    }
}
