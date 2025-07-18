// https://leetcode.com/problems/number-of-digit-one/?envType=problem-list-v2&envId=n32iyzu3

class Solution {
    public int countDigitOne(int n) {
        int count=0;
        for(long place=1;place<= n;place*=10){
            long div=place*10;
            count+=(n/div)*place + Math.min(Math.max(n%div-place+1,0),place);
        }
        return count;
    }
}
