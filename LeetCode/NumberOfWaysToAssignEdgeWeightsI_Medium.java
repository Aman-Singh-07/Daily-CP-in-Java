// https://leetcode.com/problems/number-of-ways-to-assign-edge-weights-i/description/?envType=daily-question&envId=2026-06-11

import java.util.*;

class Solution {
    public int assignEdgeWeights(int[][] edges) {
        int n = edges.length + 1;
        long MOD = 1000000007;
        
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }
        
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        
        int maxDepth = 0;
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n + 1];
        
        queue.offer(1);
        visited[1] = true;
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean movedDeeper = false;
            
            for (int i = 0; i < size; i++) {
                int curr = queue.poll();
                
                for (int neighbor : adj.get(curr)) {
                    if (!visited[neighbor]) {
                        visited[neighbor] = true;
                        queue.offer(neighbor);
                        movedDeeper = true;
                    }
                }
            }
            if (movedDeeper) {
                maxDepth++;
            }
        }
        
        if (maxDepth == 0) return 0;
        
        return (int) power(2, maxDepth - 1, MOD);
    }
    
    public long power(long base, long exp, long mod) {
        long res = 1;
        base = base % mod;
        while (exp > 0) {
            if (exp % 2 == 1) {
                res = (res * base) % mod;
            }
            base = (base * base) % mod;
            exp /= 2;
        }
        return res;
    }
}
