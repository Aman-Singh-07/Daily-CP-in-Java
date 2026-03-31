// https://www.geeksforgeeks.org/problems/find-median-in-a-stream-1587115620/1

class Solution {
    public ArrayList<Double> getMedian(int[] arr) {
        // code here
        ArrayList<Double> result=new ArrayList<>();
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
        for(int num:arr){
            maxHeap.add(num);
            minHeap.add(maxHeap.poll());
            if(maxHeap.size()<minHeap.size()){
                maxHeap.add(minHeap.poll());
            }
            if(maxHeap.size()>minHeap.size()){
                result.add((double) maxHeap.peek());
            }else{
                double median=(maxHeap.peek()+minHeap.peek())/2.0;
                result.add(median);
            }
        }
        return result;
    }
}
