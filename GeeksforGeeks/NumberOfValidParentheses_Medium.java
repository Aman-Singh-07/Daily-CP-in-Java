// https://www.geeksforgeeks.org/problems/valid-number-of-parenthesis/1

class Solution {
    int findWays(int n) {
        if(n%2==1) return 0;
        int m=n/2; 
        return catalan(m);
    }
    int catalan(int m){
        long res=1;
        for(int i=0;i<m;i++){
            res=res*(2*m-i)/(i+1);
        }
        res=res/(m+1);
        return (int) res;
    }
}
