// https://leetcode.com/problems/concatenate-non-zero-digits-and-multiply-by-sum-i/description/?envType=daily-question&envId=2026-07-07

class Solution {
    public long sumAndMultiply(int n) {
        long num=0;
        long sum=0;
        while(n>0){
            if(n%10!=0) num=num*10+n%10;
            sum+=n%10;
            n/=10;
        }
        long rev=0;
        while(num>0){
            rev=rev*10+num%10;
            num/=10;
        }
        return rev*sum;
    }
}
