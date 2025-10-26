// https://leetcode.com/contest/weekly-contest-473/problems/remove-zeros-in-decimal-representation/description/

class Solution {
    public long removeZeros(long n) {
        StringBuilder sb=new StringBuilder();
        while(n>0){
            long r=n%10;
            if(r!=0) sb.append(r);
            n/=10;
        }
        sb.reverse();
        return Long.valueOf(sb.toString());
    }
}©leetcode
