// https://www.geeksforgeeks.org/problems/reverse-first-k-elements-of-queue/1

class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        // code here
        if(q.size()<k) return q;
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<k;i++){
            s.push(q.poll());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        int rem=q.size()-k;
        for(int i=0;i<rem;i++){
            q.add(q.poll());
        }
        return q;
        
    }
}
