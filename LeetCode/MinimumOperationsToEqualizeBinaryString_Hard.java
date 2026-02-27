// https://leetcode.com/problems/minimum-operations-to-equalize-binary-string/description/?envType=daily-question&envId=2026-02-27

class Solution {
    public int minOperations(String s, int k) {
        int n=s.length();
        int count0=0;
        int count1=0;
        for(char ch:s.toCharArray())
            if(ch=='0') count0++;
            else count1++;

        if(count0==0) return 0;
        if(n==k){
            if(count0==n) return 1;
            return -1;
        }
        int x=n-k;
        long res=Long.MAX_VALUE;
        if((k%2)==(count0%2)){
            long m=Math.max((count0+k-1)/k,(count1+x-1)/x);
            if(m%2==0) m++;
            res=Math.min(res,m);
        }
        if(count0%2==0){
            long m=Math.max((count0+k-1)/k,(count0+x-1)/x);
            if(m%2==1) m++;
            res=Math.min(res,m);
        }
        return res==Long.MAX_VALUE?-1:(int)res;
    }
}
