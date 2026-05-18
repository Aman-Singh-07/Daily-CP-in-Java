// https://www.geeksforgeeks.org/problems/maximum-sum-problem2211/1

class Solution {
    public int maxSum(int n) {
        // code here.
        if(n==0 || n==1) return n;
        int a=maxSum(n/2);
        int b=maxSum(n/3);
        int c=maxSum(n/4);
        return Math.max(n,a+b+c);
        
    }
}
