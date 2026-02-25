// https://www.geeksforgeeks.org/problems/rotate-deque-by-k/1

class Solution {
    public static void rotateDeque(Deque<Integer> dq, int type, int k) {
        // code here
        if(!dq.isEmpty()){
            if(type==1){
                for(int i=0;i<k;i++){
                    dq.addFirst(dq.pollLast());
                    
                }
            }
            else{
                for(int i=0;i<k;i++){
                    dq.addLast(dq.pollFirst());
                }
            }
        }
        
    }
}
