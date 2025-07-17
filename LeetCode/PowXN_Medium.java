// https://leetcode.com/problems/powx-n/

class Solution {
    public double myPow(double x, int n) {
        long N=n;
        if(n<0){
            x=1/(x);
            N=(-1)*N;
        }
        return pow(x,N);
    }
    public double pow(double x, long N){
        if(N==0){
            return 1;
        }
        double temp=pow(x,N/2);
        if(N%2==0){
            return temp*temp;
        }
        else return temp*temp*x;
    }
}
