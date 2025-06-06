// https://www.geeksforgeeks.org/batch/dsa-at-your-own-pace/track/DSASP-Mathematics/problem/digits-in-factorial

// User function Template for Java

class Solution {
    public int digitsInFactorial(int N) {
        // code here
        if(N==0 || N==1){
            return 1;
        }
        double count=0;
        for(int i=2;i<=N;i++){
            count+=Math.log10(i);
        }
        return (int) Math.floor(count)+1;
    }
}
