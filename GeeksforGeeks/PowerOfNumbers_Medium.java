//  https://www.geeksforgeeks.org/problems/power-of-numbers-1587115620/1?page=1&category=Mathematical,Bit%20Magic&status=unsolved&sortBy=submissions

class Solution {
    public int reverseExponentiation(int n) {
        // code here
        int rev=n;
        if(n==10) rev=1;
        return (int) pow(n,rev);
    }
    
    public static long pow(int n,int x){
        if(x==0) return 1;
        long temp=pow(n,x/2);
        if(x%2==0){
            return temp*temp;
        }
        return temp*temp*n;
    }
}
