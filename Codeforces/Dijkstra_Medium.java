// https://codeforces.com/contest/20/problem/C

import java.util.*;

public class Main {
    static class Pair {
        int node;
        long weight;
        
        Pair(int node, long weight) {
            this.node = node;
            this.weight = weight;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int m = input.nextInt();
        
        List<List<Pair>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }
        
        for (int i = 0; i < m; i++) {
            int u = input.nextInt();
            int v = input.nextInt();
            long w = input.nextLong();
            
            adj.get(u).add(new Pair(v, w));
            adj.get(v).add(new Pair(u, w));
        }
        
        long[] dist = new long[n + 1];
        int[] parent = new int[n + 1];
        Arrays.fill(dist, Long.MAX_VALUE);
        
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Long.compare(a.weight, b.weight));
        
        dist[1] = 0;
        pq.add(new Pair(1, 0));
        parent[1] = 1; 
        
        while (!pq.isEmpty()) {
            Pair curr = pq.poll();
            int u = curr.node;
            long d = curr.weight;
            
            if (d > dist[u]) continue;
            if (u == n) break;
            
            for (Pair neighbor : adj.get(u)) {
                int v = neighbor.node;
                long weight = neighbor.weight;
                
                if (dist[u] + weight < dist[v]) {
                    dist[v] = dist[u] + weight;
                    parent[v] = u;
                    pq.add(new Pair(v, dist[v]));
                }
            }
        }
        
        if (dist[n] == Long.MAX_VALUE) {
            System.out.println(-1);
        } else {
            List<Integer> path = new ArrayList<>();
            int curr = n;
            
            while (parent[curr] != curr) {
                path.add(curr);
                curr = parent[curr];
            }
            path.add(1);
            
            Collections.reverse(path);
            
            StringBuilder sb = new StringBuilder();
            for (int node : path) {
                sb.append(node).append(" ");
            }
            System.out.println(sb.toString().trim());
        }
    }
}
