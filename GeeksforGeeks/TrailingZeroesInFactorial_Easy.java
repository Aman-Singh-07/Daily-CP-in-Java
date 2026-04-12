// https://www.geeksforgeeks.org/problems/trailing-zeroes-in-factorial5134/1?page=9&status=unsolved&sortBy=submissions

class Solution {
    static int trailingZeroes(int n) {
        int count = 0;

        while (n > 0) {
            count += n / 5;
            n /= 5;
        }
        
        return count;
    }
}
