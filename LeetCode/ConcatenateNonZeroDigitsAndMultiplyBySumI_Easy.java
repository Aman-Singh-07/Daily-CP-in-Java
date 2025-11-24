// https://leetcode.com/problems/concatenate-non-zero-digits-and-multiply-by-sum-i/description/

class Solution {
    public long sumAndMultiply(int n) {
        long sum=0;
        int num=reverse(n);
        int num2=reverse(num);
        int temp=num2;
        while(temp>0){
            sum+=temp%10;
            temp/=10;
        }
        return sum*num2;
        
    }

    public int reverse(int n){
        int temp=n;
        int rev=0;
        while(temp>0){
            if(temp%10!=0){
                rev=rev*10+temp%10;
            }
            temp/=10;
        }
        return rev;
    }
}
