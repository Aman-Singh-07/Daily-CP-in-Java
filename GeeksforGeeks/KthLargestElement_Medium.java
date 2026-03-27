// https://www.geeksforgeeks.org/problems/kth-largest-element5034/1

class Solution {
    // Function to return kth largest element from an array.
    public static int KthLargest(int arr[], int k) {
        // Your code here
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            minHeap.add(arr[i]);
            if(minHeap.size()>k) minHeap.poll();
            
        }
        return minHeap.peek();
    }
}
