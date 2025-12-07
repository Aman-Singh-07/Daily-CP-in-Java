// https://leetcode.com/problems/largest-prime-from-consecutive-prime-sum/description/

class Solution {
    public int largestPrime(int n) {
        int sum=0;
        int temp=n;
        int res=0;
        for(int i=2;i<=n;i++){
            if(isPrime(i)) {
                sum+=i;
                if(sum>n) break;
                if(isPrime(sum)){
                    res=sum;
                }
            }
        }
        return res;
        
        
    }

    public static boolean isPrime(int num){
        if(num<2) return false;
        if(num==2) return true;
        if(num==3) return true;
        if(num%2==0 || num%3==0) return false;
        for(int i=5;i*i<=num;i+=6){
            if(num%i==0 || num%(i+2)==0) return false;
        }
        return true;
    }
}
