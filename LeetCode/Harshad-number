// https://leetcode.com/problems/harshad-number/

class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int n=x;
        int sum=0;
        while(n>0){
            int r=n%10;
            sum+=r;
            n/=10;
        }
        return (x%sum==0)?sum:-1;
        
    }
}
