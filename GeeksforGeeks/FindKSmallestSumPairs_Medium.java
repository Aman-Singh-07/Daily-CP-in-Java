// https://www.geeksforgeeks.org/problems/find-k-smallest-sum-pairs/1

class Solution {
    public ArrayList<ArrayList<Integer>> kSmallestPair(int[] arr1, int[] arr2, int k) {
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        PriorityQueue<int[]> minHeap=new PriorityQueue<>((a,b)-> 
            Integer.compare(arr1[a[0]]+arr2[a[1]],arr1[b[0]]+arr2[b[1]])
        );
        for(int i=0;i<Math.min(arr1.length,k);i++){
            minHeap.offer(new int[]{i,0});
        }
        while(k>0 && !minHeap.isEmpty()){
            int[] indices=minHeap.poll();
            int i=indices[0],j=indices[1];
            ArrayList<Integer> pair=new ArrayList<>();
            pair.add(arr1[i]);
            pair.add(arr2[j]);
            result.add(pair);
            if(j+1<arr2.length){
                minHeap.offer(new int[]{i,j+1});
            }
            k--;
        }
        return result;
    }
}
