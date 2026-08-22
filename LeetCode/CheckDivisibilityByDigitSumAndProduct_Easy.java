// https://leetcode.com/problems/check-divisibility-by-digit-sum-and-product/?envType=daily-question&envId=2026-08-22

class Solution {
    public boolean checkDivisibility(int num) {
        int sum=0;
        int pro=1;
        int temp=num;
        while(num>0){
            sum+=num%10;
            pro*=num%10;
            num/=10;
        }
        return temp%(sum+pro)==0;
    }
}
