// https://www.geeksforgeeks.org/problems/prime-number2314/1?page=4&sortBy=submissions

class Solution {
    static boolean isPrime(int n) {
        // code here
        if(n<=1) return false;
        if(n==2 || n==3) return true;
        if(n%2==0 || n%3==0) return false;
        for(int i=5;i*i<=n;i+=6){
            if(n%i==0 || n%(i+2)==0) return false;
        }
        return true;
    }
}
