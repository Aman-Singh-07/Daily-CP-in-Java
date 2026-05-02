// https://leetcode.com/problems/rotated-digits/?envType=daily-question&envId=2026-05-02

class Solution {
    public int rotatedDigits(int n) {
        int goodCount = 0;
        for (int i = 1; i <= n; i++) {
            if (isGood(i)) {
                goodCount++;
            }
        }
        return goodCount;
    }
    
    private boolean isGood(int num) {
        boolean hasChangedDigit = false;
        
        while (num > 0) {
            int digit = num % 10;
            
            if (digit == 3 || digit == 4 || digit == 7) {
                return false;
            }
            
            if (digit == 2 || digit == 5 || digit == 6 || digit == 9) {
                hasChangedDigit = true;
            }
            
            num /= 10;
        }
        
        return hasChangedDigit;
    }
}
