// https://www.geeksforgeeks.org/problems/sum-of-products5049/1

class Solution {
    public long pairAndSum(int[] arr) {
        long totalSum = 0;
        for (int k = 0; k < 30; k++) {
            long count = 0;
            for (int num : arr) {
                if ((num & (1 << k)) != 0) {
                    count++;
                }
            }
            long pairs = (count * (count - 1)) / 2;
            totalSum += pairs * (1L << k);
        }

        return totalSum;
    }
}
