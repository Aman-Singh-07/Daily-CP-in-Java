// https://www.geeksforgeeks.org/problems/balancing-pan5038/1

class Solution {
    public boolean balancePan(int a, int b) {
        // code here
        //if(a>b) return false;
        while(b>0){
            int rem=b%a;
            if(rem==0) b/=a;
            else if(rem==1) b=(b-1)/a;
            else if(rem==(a-1)) b=(b+1)/a;
            else return false;
        }
        return true;
    }
}
