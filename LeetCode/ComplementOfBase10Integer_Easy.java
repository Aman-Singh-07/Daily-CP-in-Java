// https://leetcode.com/problems/complement-of-base-10-integer/description/?envType=problem-list-v2&envId=n32iyzu3

class Solution {
    public int bitwiseComplement(int n) {
        if(n==0) return 1;
        if(n==1) return 0;
        int temp=n;
        int res=0;
        while(temp>0){
            temp=temp>>1;
            res=(res<<1)|1;
        }
        return n^res;
    }
}
