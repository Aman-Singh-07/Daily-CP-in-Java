// https://www.geeksforgeeks.org/problems/negative-weight-cycle3504/1

class Solution {
    public boolean isNegativeWeightCycle(int V, int[][] edges) {
        // code here
        long[] dist=new long[V];
        for(int i=0;i<V;i++){
            boolean isTrue=false;
            for(int[] edge:edges){
                int u=edge[0];
                int v=edge[1];
                int w=edge[2];
                
                if(dist[v]>dist[u]+w){
                    dist[v]=dist[u]+w;
                    isTrue=true;
                    
                    if(i==V-1) return true;
                }
            }
            if(!isTrue) return false;
        }
        return false;
    }
}
