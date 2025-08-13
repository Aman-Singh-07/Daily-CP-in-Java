// https://leetcode.com/problems/power-of-three/description/?envType=daily-question&envId=2025-08-13

class Solution {
    public boolean isPowerOfThree(int n) {
        return n>0 && 1162261467%n==0;
    }
}
