// https://www.geeksforgeeks.org/problems/high-effort-vs-low-effort0213/1

class Solution {
    public int maxTask(int[] h, int[] l) {
        // code here
        int prev1=Math.max(h[0],l[0]);
        int prev2=0;
        for(int i=1;i<h.length;i++){
            int min=prev1+l[i];
            int max=prev2+h[i];
            int curr=Math.max(max,min);
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }
}
