// https://leetcode.com/problems/four-divisors/description/?envType=problem-list-v2&envId=n32iyzu3

class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum=0;
        for(int num:nums){
            sum+=fourDivisor(num);
        }
        return sum; 
    }

    public static int fourDivisor(int num){
        int count=0;
        int sum=1+num;
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                int j=num/i;
                if(i==j){
                    count++;
                    sum+=i;
                }
                else{
                    count+=2;
                    sum+=i+j;
                }
            }
        }
        if(count!=2) return 0;
        return sum;

    }
}
