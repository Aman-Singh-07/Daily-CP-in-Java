// https://leetcode.com/problems/three-divisors/

class Solution {
    public boolean isThree(int n) {
        return ((int) Math.sqrt(n)* (int) Math.sqrt(n)==n)?isPrime((int) Math.sqrt(n)):false;
        
    }
    public static boolean isPrime(int x){
        if(x==1) return false;
        if(x==2 || x==3) return true;
        if(x%2==0 || x%3==0) return false;
        for(int i=5;i*i<=x;i+=6){
            if(x%i==0 || x%(i+2)==0) return false;
        }
        return true;
    }
}
