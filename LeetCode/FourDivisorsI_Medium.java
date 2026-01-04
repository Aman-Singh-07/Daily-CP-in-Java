// https://leetcode.com/problems/four-divisors/?envType=daily-question&envId=2026-01-04

class Solution {
    public int sumFourDivisors(int[] nums) {
        int res=0;
        for(int num:nums){
            int sum=0;
            int count=0;
            for(int i=1;i*i<=num;i++){
                if(num%i==0){
                    sum+=i;
                    count++;
                    if(num/i!=i){
                        sum+=num/i;
                        count++;
                    }
                }
                if(count>4){
                    break;
                }
            }
            if(count==4) res+=sum;
        }
        return res;
    }
}
