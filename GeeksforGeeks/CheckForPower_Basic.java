// https://www.geeksforgeeks.org/problems/check-if-a-number-is-power-of-another-number5442/1

class Solution {
    public boolean isPower(int x, int y) {
        // code here
        if (x == 1) return y == 1;
        if (y == 1) return true;
        
        while (y > 0 && y % x == 0) {
            y /= x;
        }
        
        return y == 1;
    }
}
