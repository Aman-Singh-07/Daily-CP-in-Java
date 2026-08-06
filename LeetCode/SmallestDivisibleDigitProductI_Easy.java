// https://leetcode.com/problems/smallest-divisible-digit-product-i/description/?envType=daily-question&envId=2026-08-06

class Solution {
    public int smallestNumber(int n, int t) {
        while(n%t!=0 && n<10){
            n++;
        }
        while(((n/10)*(n%10))%t!=0){
            n++;
        }
        return n;
    }
}
