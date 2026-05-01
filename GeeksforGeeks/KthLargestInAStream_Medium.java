// https://www.geeksforgeeks.org/problems/kth-largest-element-in-a-stream2220/1

class Solution {
    static ArrayList<Integer> kthLargest(int[] arr, int k) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<k;i++){
            pq.add(arr[i]);
            if(i!=0) list.add(-1);
        }
        list.add(pq.peek());
        for(int i=k;i<arr.length;i++){
            if(arr[i]>pq.peek()){
                pq.poll();
                pq.add(arr[i]);
            }
            list.add(pq.peek());
        }
        return list;
    }
}
