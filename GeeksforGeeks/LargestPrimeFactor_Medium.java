// https://www.geeksforgeeks.org/problems/largest-prime-factor2601/1?page=12&status=unsolved&sortBy=submissions

// User function Template for Java

class Solution {
    static int largestPrimeFactor(int n) {
        // code here
        int max=1;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                int num1=i;
                int num2=n/i;
                if(isPrime(num1)) max=Math.max(max,num1);
                if(isPrime(num2)) max=Math.max(max,num2);
            }
        }
        return max;
    }
    
    static boolean isPrime(int n){
        if(n<=1) return false;
        if(n==2 || n==3) return true;
        if(n%2==0 || n%3==0) return false;
        for(int i=5;i*i<=n;i+=6){
            if(n%i==0 || n%(i+2)==0) return false;
        }
        return true;
    }
}
