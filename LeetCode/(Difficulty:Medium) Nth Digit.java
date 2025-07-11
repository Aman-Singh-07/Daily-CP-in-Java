// https://leetcode.com/problems/nth-digit/description/

class Solution {
    public int findNthDigit(int n) {
        int dLength=1;
        long count=9;
        int start=1;
        while(n>dLength*count){
            n-=dLength*count;
            dLength++;
            count*=10;
            start*=10;
        }
        start+=(n-1)/dLength;
        String s = Integer.toString(start);
        return s.charAt((n-1)%dLength)-'0';
    }
}
