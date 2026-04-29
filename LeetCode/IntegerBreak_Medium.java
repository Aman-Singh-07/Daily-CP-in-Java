//  https://leetcode.com/problems/integer-break/description/?envType=problem-list-v2&envId=wqama0x5

class Solution {
    public int integerBreak(int n) {
        if(n==2) return 1;
        if(n==3) return 2;
        long res=1;
        while((n-3)>=2){
            n-=3;
            res*=3;
        }
        if(n!=0) res*=n;
        return (int) res;
    }
}
