// https://leetcode.com/problems/number-of-ways-to-paint-n-3-grid/description/?envType=daily-question&envId=2026-01-03

class Solution {
    public int numOfWays(int n) {
        long mod=1000000007;
        long one=6;
        long two=6;
        for(int i=1;i<n;i++){
            long new1=(2*one+2*two)%mod;
            long new2=(2*one+3*two)%mod;
            one=new1;
            two=new2;
        }
        return (int) ((one+two)%mod);
    }
}
