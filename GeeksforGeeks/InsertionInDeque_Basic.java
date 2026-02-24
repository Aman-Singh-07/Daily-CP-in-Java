// https://www.geeksforgeeks.org/problems/insertion-in-deque/1

class Solution {
    public Deque<Integer> dqInsertion(List<Integer> arr) {
        // code here
        Deque<Integer> d=new ArrayDeque<>();
        for(int num:arr){
            d.offer(num);
        }
        return d;
    }
}
