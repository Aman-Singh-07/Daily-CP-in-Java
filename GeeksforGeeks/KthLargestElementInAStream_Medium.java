// https://www.geeksforgeeks.org/problems/kth-largest-element-in-a-stream-1587115620/1

class Solution {
    // Function to print kth largest element for each element in the stream.
    public void kthLargest(int arr[], int n, int k) {
        // Your code here
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        for(int i=0;i<k;i++){
            minHeap.add(arr[i]);
            arr[i]=-1;
        }
        arr[k-1]=minHeap.peek();
        for(int i=k;i<n;i++){
            if(arr[i]>minHeap.peek()){
                minHeap.poll();
                minHeap.add(arr[i]);
            }
            arr[i]=minHeap.peek();
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
