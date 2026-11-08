// https://www.geeksforgeeks.org/problems/find-the-minimum-time0253/1

class Solution {
    public int minTime(int n, int s1, int s2) {
        // code here
        int doc1=(int)((long) n*s2/(s1+s2));
        int doc2=Math.min(n,doc1+1);
        int time1=Math.max(doc1*s1,(n-doc1)*s2);
        int time2=Math.max(doc2*s1,(n-doc2)*s2);
        return Math.min(time1,time2);
    }
}
