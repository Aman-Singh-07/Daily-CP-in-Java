// https://www.geeksforgeeks.org/problems/max-dag-edges/1

class Solution {
    public int maxEdgesToAdd(int V, int[][] edges) {
        // Code here
        return ((V*(V-1))/2)-edges.length;
    }
}
