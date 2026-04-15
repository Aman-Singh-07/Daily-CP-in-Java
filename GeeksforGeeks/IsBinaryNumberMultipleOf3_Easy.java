// https://www.geeksforgeeks.org/problems/is-binary-number-multiple-of-30654/1?page=9&status=unsolved&sortBy=submissions

class Solution {
    boolean isDivisible(String s) {
        int rem = 0;
        
        for (int i = 0; i < s.length(); i++) {
            int bit = s.charAt(i) - '0';
            
            rem = (rem * 2 + bit) % 3;
        }
        
        return rem == 0;
    }
}
