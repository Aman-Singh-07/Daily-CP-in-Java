// https://www.geeksforgeeks.org/problems/optimal-file-merge/1

class Solution {
    public int minComputation(int[] files) {
        // code here
        int res=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int num:files){
            pq.add(num);
        }
        while(!pq.isEmpty()){
            int num1=pq.poll();
            int num2=0;
            if(!pq.isEmpty()){
                num2=pq.poll();
            }else break;
            pq.add(num1+num2);
            res+=num1+num2;
        }
        return res;
    }
}
