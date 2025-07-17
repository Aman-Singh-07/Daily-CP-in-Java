// https://leetcode.com/problems/prime-number-of-set-bits-in-binary-representation/

class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++){
            int num=setBit(i);
            if(isprime(num)) count++;
        }
        return count;    
    }
    public static boolean isprime(int n){
        if(n<=1) return false;
        if(n==2 || n==3) return true;
        if(n%2==0 || n%3==0) return false;
        for(int i=5;i*i<=n;i+=6){
            if(n%i==0 || n%(i+2)==0){
                return false;
            }
        }
        return true;
    }


    public static int setBit(int n){
        int count=0;
        while(n!=0){
            if((n&(1))==1)  count++;
            n=n>>1;
        }
        return count;
    }

}
