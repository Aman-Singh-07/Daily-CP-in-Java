// https://leetcode.com/problems/maximize-active-section-with-trade-i/description/?envType=daily-question&envId=2026-07-21

class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int one=0;
        int res=0;
        int prevZero=Integer.MIN_VALUE;
        for(int i=0;i<s.length();){
            int j=i+1;
            while(j<s.length() && s.charAt(j)==s.charAt(i)) j++;
            int len=j-i;
            if(s.charAt(i)=='1') one+=len;
            else{
                res=Math.max(res,prevZero+len);
                prevZero=len;
            }
            i=j;
        }
        return one+res;
    }
}
