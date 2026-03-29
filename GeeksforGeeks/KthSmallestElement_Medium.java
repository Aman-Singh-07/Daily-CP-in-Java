// https://www.geeksforgeeks.org/problems/kth-smallest-element5545-1587115620/1

class Solution {
    public int kthSmallest(int[] arr, int k) {
        // code here
        PriorityQueue<Integer> minHeap=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<k;i++){
            minHeap.add(arr[i]);
        }
        for(int i=k;i<arr.length;i++){
            if(arr[i]<minHeap.peek()){
                minHeap.poll();
                minHeap.add(arr[i]);
            }
        }
        return minHeap.peek();
    }
}
