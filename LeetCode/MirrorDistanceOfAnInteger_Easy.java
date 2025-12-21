// https://leetcode.com/problems/mirror-distance-of-an-integer/description/

class Solution {
    public int mirrorDistance(int n) {
        return Math.abs(n-reverse(n));
    }

    public static int reverse(int n){
        int rev=0;
        while(n>0){
            int r=n%10;
            rev=rev*10+r;
            n/=10;
        }
        return rev;
    }
}
