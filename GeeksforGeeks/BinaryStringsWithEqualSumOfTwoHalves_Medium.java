// https://www.geeksforgeeks.org/problems/count-even-length1907/1

class Solution {
    public int computeValue(int n) {
        // code here
        long MOD=1000000007;
        long num=1;
        long dem=1;
        for(int i=1;i<=n;i++){
            num=(num*(n+i))%MOD;
            dem=(dem*i)%MOD;
        }
        long res=(num*modInverse(dem,MOD))%MOD;
        return (int) res;
    }
    public long power(long base,long exp,long MOD){
        long res=1;
        base=base%MOD;
        while(exp>0){
            if(exp%2!=0){
                res=(res*base)%MOD;
            }
            base=(base*base)%MOD;
            exp/=2;
        }
        return res;
    }
    public long modInverse(long n, long mod){
        return power(n,mod-2,mod);
    }
}
