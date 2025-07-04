// https://leetcode.com/problems/prime-arrangements/description/

class Solution {
    public int numPrimeArrangements(int n) {
        int count=0;
        for(int i=2;i<=n;i++){
            if(isPrime(i)) count++;
        }
        long result=(fact(count)*fact(n-count))%1000000007;
        return (int) result;

    }

    public static boolean isPrime(int n){
        if(n==2 || n==3) return true;
        if(n%2==0 || n%3==0) return false;
        for(int i=5;i*i<=n;i+=6){
            if(n%i==0 || n%(i+2)==0) return false;
        }
        return true;
    }

    public static long fact(int n){
        long res=1;
        for(int i=2;i<=n;i++){
            res=(res*i)%1000000007;
        }
        return res;
    }
}
