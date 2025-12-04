// https://www.geeksforgeeks.org/problems/sum-of-bit-differences2937/1?page=1&difficulty=Medium&status=unsolved&sortBy=difficulty

class Solution {
    public int sumBitDifferences(int[] arr) {
        int n = arr.length;
        int res = 0;
        for (int bit = 0; bit < 32; bit++) {
            int countOnes = 0;
            for (int i = 0; i < n; i++) {
                if ((arr[i] & (1 << bit)) != 0) {
                    countOnes++;
                }
            }
            int countZeros = n - countOnes;
            res += 2 * countOnes * countZeros;
        }
        return res;
    }
}
