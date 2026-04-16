// https://leetcode.com/problems/count-digit-appearances/

class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int res=0;
        for(int num:nums){
            res+=count(num,digit);
        }
        return res;
    }
    public static int count(int num,int digit){
        int res=0;
        while(num>0){
            int r=num%10;
            if(r==digit) res++;
            num/=10;
        }
        return res;
    }
}
