// https://www.geeksforgeeks.org/problems/merge-k-sorted-arrays/1

class Solution {
    public ArrayList<Integer> mergeArrays(int[][] mat) {
        // Code here
        ArrayList<Integer> list=new ArrayList<>();
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                minHeap.add(mat[i][j]);
            }
        }
        while(!minHeap.isEmpty()) list.add(minHeap.poll());
        return list;
    }
}
