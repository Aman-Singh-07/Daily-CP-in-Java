// https://leetcode.com/problems/base-7/

class Solution {
    public String convertToBase7(int n) {
        if(n==0) return "0";
        StringBuilder sb=new StringBuilder();
        boolean isNegative=n<0;
        n=Math.abs(n);
        while((n)>0){
            sb.append((n)%7);
            n/=7;
        }
        if(isNegative){
            sb.append("-");
        }
        sb.reverse();
        return sb.toString();
    }
}
