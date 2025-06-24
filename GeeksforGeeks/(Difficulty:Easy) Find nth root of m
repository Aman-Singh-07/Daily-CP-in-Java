// https://www.geeksforgeeks.org/problems/find-nth-root-of-m5843/1?page=1&category=Mathematical,Bit%20Magic&status=unsolved&sortBy=submissions

// User function Template for Java

class Solution {
    public int nthRoot(int n, int m) {
        // code here
        if(n==1) return m;
        for(int i=1;i*i<=m;i++){
            if((int)pow(i,n)==m) return i;
        }
        return -1;
    }
    public static long pow(int n,int x){
        if(x==0) return 1;
        long temp=pow(n,x/2);
        if(x%2==0) return temp*temp;
        return temp*temp*n;
    }
}
