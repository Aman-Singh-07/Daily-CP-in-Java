// https://www.geeksforgeeks.org/problems/bfs-traversal-of-graph/1?page=1&status=unsolved&sortBy=submissions

class Solution {
    // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        int V=adj.size();
        ArrayList<Integer> result=new ArrayList<>();
        boolean[] visited=new boolean[V];
        Queue<Integer> queue=new LinkedList<>();
        queue.add(0);
        visited[0]=true;
        while(!queue.isEmpty()){
            int node=queue.poll();
            result.add(node);
            for(int neighbor:adj.get(node)){
                if(!visited[neighbor]){
                    visited[neighbor]=true;
                    queue.add(neighbor);
                }
            }
        }
        return result;
    }
}
