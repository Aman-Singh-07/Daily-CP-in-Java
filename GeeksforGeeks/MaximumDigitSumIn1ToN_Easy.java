// https://www.geeksforgeeks.org/problems/biggest-integer-having-maximum-digit-sum1704/1

class Solution {
    public int findMax(int n) {
        int bestVal = n;
        int bestSum = sum(n);

        long p = 1; 
        int temp = n;

        while (temp > 0) {
            int digit = temp % 10;

            if (digit > 0) {
                long cand = (n / (p * 10)) * (p * 10) + (digit - 1) * p + (p - 1);
                int candSum = sum((int) cand);

                if (candSum > bestSum) {
                    bestSum = candSum;
                    bestVal = (int) cand;
                } else if (candSum == bestSum) {
                    bestVal = Math.max(bestVal, (int) cand);
                }
            }

            p *= 10;
            temp /= 10;
        }

        return bestVal;
    }

    public int sum(int num) {
        int res = 0;
        while (num > 0) {
            res += num % 10;
            num /= 10;
        }
        return res;
    }
}
