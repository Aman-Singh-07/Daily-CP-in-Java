// https://www.geeksforgeeks.org/problems/minimum-steps-to-halve-sum/1

class Solution {
    public int minOperations(int[] arr){
        double totalSum=0;
        PriorityQueue<Double> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
        for(int num:arr){
            double val=(double) num;
            totalSum+=val;
            maxHeap.add(val);
        }
        double target=totalSum/2;
        int count=0;
        double reducedSum=0;
        while(reducedSum<target){
            double max=maxHeap.poll();
            double half=max/2;
            reducedSum+=half;
            maxHeap.add(half);
            count++;
        }
        return count;
    }
}
