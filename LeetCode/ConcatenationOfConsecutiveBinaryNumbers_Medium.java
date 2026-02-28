// https://leetcode.com/problems/concatenation-of-consecutive-binary-numbers/?envType=daily-question&envId=2026-02-28

class Solution {
    public int concatenatedBinary(int n) {
        long res=0;
        int MOD=1000000007;
        int bitLength=0;
        for(int i=1;i<=n;i++){
            if((i&(i-1))==0){
                bitLength++;
            }
            res=((res<<bitLength)+i)%MOD;
        }
        return (int) res;
    }
}
