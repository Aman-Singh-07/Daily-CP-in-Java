// https://www.geeksforgeeks.org/problems/bits-basic-operations/1?page=4&difficulty=Medium&status=unsolved&sortBy=accuracy

// User function Template for Java

class Solution {

    public int XOR(int n, int m) {
        // Code here
        return n^m;
        
    }

    public int check(int a, int b) {
        
        // Code here
         if ((b & (1 << (a - 1))) != 0) return 1;
        return 0;
    }

        
    public int setBit(int c, int d) {
        // Code here
        return d | (1 << c);
    }
}
