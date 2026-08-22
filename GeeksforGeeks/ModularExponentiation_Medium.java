// https://www.geeksforgeeks.org/problems/modular-exponentiation-for-large-numbers5537/1

class Solution {
    public int powMod(int x, int n, int M) {
        // code here
        long res=1;
        long base=x%M;
        while(n>0){
            if(n%2!=0){
                res=(res*base)%M;
            }
            base=(base*base)%M;
            n/=2;
        }
        return (int) res;
    }
}
