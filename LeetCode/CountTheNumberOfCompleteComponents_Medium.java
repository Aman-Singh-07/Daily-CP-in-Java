// https://leetcode.com/problems/count-the-number-of-complete-components/description/?envType=daily-question&envId=2026-07-11

class Solution {
    static int v,d;
    public int countCompleteComponents(int n, int[][] edges) {
        List<Integer>[] arr=new ArrayList[n];
        for(int i=0;i<n;i++){
            arr[i]=new ArrayList<>();
        }
        for(int i=0;i<edges.length;i++){
            arr[edges[i][0]].add(edges[i][1]);
            arr[edges[i][1]].add(edges[i][0]);

        }
        boolean[] visited=new boolean[n];
        int res=0;
        for(int i=0;i<n;i++){
            boolean isTrue=visited[i];
            if(!isTrue){
                v=0;
                d=0;
                dfs(i,arr,visited);
                if(d==v*(v-1)) res++;
            }
        }
        return res;
    }

    public void dfs(int x,List<Integer>[] arr,boolean[] visited){
        v++;
        d+=arr[x].size();
        visited[x]=true;
        for(int num:arr[x]){
            if(!visited[num]) dfs(num,arr,visited);
        }
    }
}
