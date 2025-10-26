// https://www.geeksforgeeks.org/problems/minimum-cost-of-ropes-1587115620/1

class Solution {
    public static int minCost(int[] arr) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int num:arr){
            pq.add(num);
        }
        int res=0;
        while(pq.size()>1){
            int first=pq.poll();
            int second=pq.poll();
            int sum=first+second;
            res+=sum;
            pq.add(sum);
        }
        return res;
    }
}
