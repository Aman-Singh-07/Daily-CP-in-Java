// https://www.geeksforgeeks.org/problems/ticket-sellers3241/1

class Solution {
    public int maxAmount(int[] arr, int k) {
        // code here
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int num:arr){
            pq.add(num);
        }
        long sum=0;
        while(!pq.isEmpty() && k>0){
            int num=pq.poll();
            if(num<0) break;
            sum=(sum+num)%1000000007;
            pq.add(num-1);
            k--;
        }
        return (int) sum%1000000007;
    }
}
