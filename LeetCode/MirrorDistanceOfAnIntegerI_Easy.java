// https://leetcode.com/problems/mirror-distance-of-an-integer/?envType=daily-question&envId=2026-04-18

class Solution {
    public int mirrorDistance(int n) {
        int temp=n;
        int rev=0;
        while(temp>0){
            rev=rev*10+temp%10;
            temp/=10;
        }
        return Math.abs(n-rev);
    }
}
