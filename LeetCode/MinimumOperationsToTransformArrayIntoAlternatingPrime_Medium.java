// https://leetcode.com/problems/minimum-operations-to-transform-array-into-alternating-prime/description/

class Solution {

    public static boolean isPrime(int num){
        if(num==1) return false;
        if(num==2 || num==3) return true;
        if(num%2==0 || num%3==0) return false;
        for(int i=5;i*i<=num;i+=6){
            if(num%i==0 || num%(i+2)==0) return false;
        }
        return true;
    }
    public int minOperations(int[] nums) {
        int res=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                if(!isPrime(nums[i])){
                    int nextPrime=nums[i]+1;
                    while(!isPrime(nextPrime)) nextPrime++;
                    res+=nextPrime-nums[i];
                }
            }else{
                if(isPrime(nums[i])){
                    if(nums[i]==2) res+=2;
                    else res+=1;
                }
            }
        }
        return res;
    }
}
