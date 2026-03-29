// https://www.geeksforgeeks.org/problems/most-occurring-elements-1587115620/1

class Solution {
    // Function to print the sum of frequencies of k numbers
    // with most occurrences in an array.
    int kMostFrequent(int arr[], int n, int k) {
        // your code here
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num:map.values()){
            maxHeap.add(num);
        }
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=maxHeap.poll();
        }
        return sum;
        
    }
}
