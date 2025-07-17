// https://leetcode.com/problems/alternating-digit-sum/

class Solution {
    public int alternateDigitSum(int n) {
        int reverse=0;
        while(n>0){
            int r=n%10;
            reverse=reverse*10+r;
            n=n/10;
        }
        int x=1;
        int sum=0;
        while(reverse>0){
            int rm=reverse%10;
            sum+=rm*x;
            x*=(-1);
            reverse/=10;
        }
        return sum;
        
    }
}
