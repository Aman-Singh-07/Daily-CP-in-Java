// https://leetcode.com/problems/super-pow/

class Solution {
    public int superPow(int a, int[] b) {
        int res=1;
        a%=1337;
        for(int digit:b){
            res=modPow(res,10)*modPow(a,digit)%1337;
        }
        return res;
    }
    public static int modPow(int a,int k){
        int res=1;
        a%=1337;
        while(k>0){
            if((k&1)==1) res=res*a%1337;
            a=a*a%1337;
            k>>=1;
        }
        return res;
    }
}
