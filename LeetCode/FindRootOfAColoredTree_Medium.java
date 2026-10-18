// https://leetcode.com/problems/find-root-of-a-colored-tree/description/

class Solution {
    public int findColoredRoot(int[][] edges, String colors) {
        int n=colors.length();
        int[] deg=new int[n];
        int[] total=new int[n];
        int[] arr=new int[n];
        fill(colors,n,arr);
        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            total[u]++;
            total[v]++;
            if(arr[u]==arr[v]) return -1;
            if(arr[v]==(arr[u]+1)%3) deg[v]++;
            else if(arr[u]==(arr[v]+1)%3) deg[u]++;
            else return -1;
        }

        int one=-1;
        int zero=0;
        for(int i=0;i<n;i++){
            if(deg[i]==0){
                zero++;
                one=i;
            }
            if(deg[i]>1) return -1;
        }
        if(zero==1 && total[one]<=2) return one;
        return -1;
    }

    public static void fill(String colors, int n,int[] arr){
        for(int i=0;i<n;i++){
            char ch=colors.charAt(i);
            if(ch=='R') arr[i]=0;
            else if(ch=='B') arr[i]=1;
            else if(ch=='W') arr[i]=2;
        }
    }
}
