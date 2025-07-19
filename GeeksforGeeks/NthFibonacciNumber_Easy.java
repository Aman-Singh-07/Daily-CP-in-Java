// https://www.geeksforgeeks.org/problems/nth-fibonacci-number1335/1?page=4&sortBy=submissions

// User function Template for Java

class Solution {
    public int nthFibonacci(int n) {
        // code here
        if(n==1) return 1;
        int a=0;
        int b=1;
        int c=0;
        for(int i=2;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }
}
