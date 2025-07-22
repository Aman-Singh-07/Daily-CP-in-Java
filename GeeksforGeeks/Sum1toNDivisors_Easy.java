// https://www.geeksforgeeks.org/problems/sum-of-all-divisors-from-1-to-n4738/1?page=5&status=unsolved&sortBy=submissions

class Solution {
    public static long sumOfDivisors(long n) {
        // code here
        long sum=0;
        for(int i=1;i<=n;i++){
            sum+=fun(i);
        }
        return sum;
    }
    public static long fun(int n){
        long res=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0 && n/i==i) res+=i;
            else if(n%i==0) res+=i+(n/i);
        }
        return res;
    }
}
