// https://leetcode.com/problems/gcd-of-odd-and-even-sums/

class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumEven=0;
        int sumOdd=0;
        int l=1;
        int m=1;
        for(int i=0;i<n;i++){
            sumEven+=l*2;
            l++;
            sumOdd+=m;
            m+=2;
        }
        return gcd(sumEven,sumOdd);
    
        
    }

    public static int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}
