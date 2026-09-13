// https://www.geeksforgeeks.org/problems/party-in-town3951/1

class Solution {
    public int partyHouse(ArrayList<ArrayList<Integer>> adj) {
        int n = adj.size();
        if (n <= 1) return 0;
        int[] firstBFS = bfs(0, adj, n);
        int farthestNode = firstBFS[0];
        int[] secondBFS = bfs(farthestNode, adj, n);
        int diameter = secondBFS[1];
        return (diameter + 1) / 2;
    }
    public int[] bfs(int start, ArrayList<ArrayList<Integer>> adj, int n) {
        int[] dist = new int[n];
        Arrays.fill(dist, -1);
        Queue<Integer> queue = new LinkedList<>();

        queue.add(start);
        dist[start] = 0;

        int farthestNode = start;
        int maxDist = 0;

        while (!queue.isEmpty()) {
            int curr = queue.poll();

            for (int neighbor : adj.get(curr)) {
                int neighborIdx = neighbor - 1; 

                if (dist[neighborIdx] == -1) {
                    dist[neighborIdx] = dist[curr] + 1;
                    queue.add(neighborIdx);

                    if (dist[neighborIdx] > maxDist) {
                        maxDist = dist[neighborIdx];
                        farthestNode = neighborIdx;
                    }
                }
            }
        }

        return new int[]{farthestNode, maxDist};
    }
}
