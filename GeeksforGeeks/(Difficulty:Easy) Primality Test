//

// User function Template for Java

class Solution {
    public boolean isPrime(int N) {
        // code here
        if(N<=1) return false;
        else if(N==2 || N==3) return true;
        else if(N%2==0 || N%3==0) return false;
        for(int i=5;i*i<=N;i+=6){
            if(N%i==0 || N%(i+2)==0) return false;
        }
        return true;
    }
}
