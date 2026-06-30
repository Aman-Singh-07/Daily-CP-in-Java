// https://www.geeksforgeeks.org/problems/degree-of-each-vertices-in-a-graph/1?page=1&status=unsolved&sortBy=accuracy

class Solution {
    public ArrayList<ArrayList<Integer>> findInOutDegree(int V, int[][] edges) {
        //   code here
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for(int i=0;i<V;i++){
            ArrayList<Integer> l=new ArrayList<>();
            l.add(0);
            l.add(0);
            list.add(l);
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            
            list.get(u).set(1, list.get(u).get(1) + 1); 
            list.get(v).set(0, list.get(v).get(0) + 1); 
        }
        return list;
    }
}
