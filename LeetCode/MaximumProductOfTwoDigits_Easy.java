// https://leetcode.com/problems/maximum-product-of-two-digits/description/?envType=daily-question&envId=2026-07-25

class Solution {
    public int maxProduct(int n) {
        int max1=0;
        int max2=0;
        while(n>0){
            int rem=n%10;
            if(rem>=max1){
                max2=max1;
                max1=rem;
            }
            else if(rem<max1 && rem>max2){
                max2=rem;
            }
            n/=10;
        }
        return max1*max2;
    }
}
