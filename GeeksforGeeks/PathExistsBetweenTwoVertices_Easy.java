// https://www.geeksforgeeks.org/problems/path-exists/1

class Solution {
    public boolean checkPath(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        // code here
        int n=adj.size();
        boolean[] visited=new boolean[n];
        Queue<Integer> queue=new LinkedList<>();
        queue.add(u);
        visited[u]=true;
        while(!queue.isEmpty()){
            int num=queue.poll();
            if(num==v) return true;
            for(int val:adj.get(num)){
                if(!visited[val]){
                    visited[val]=true;
                    queue.add(val);
                }
            }
        }
        return false;
    }
}
