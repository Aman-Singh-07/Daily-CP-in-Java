// https://www.geeksforgeeks.org/problems/number-of-palindromic-strings2706/1

class Solution {
    public int palindromicStrings(int n, int k) {
        // code here
        long res=0;
        long MOD=1000000007;
        for(int i=1;i<=n;i++){
            int req=(i+1)/2;
            long count=1;
            for(int j=0;j<req;j++){
                count=(count*(k-j))%MOD;
            }
            res=(res+count)%MOD;
        }
        return (int) res;
    }
}
