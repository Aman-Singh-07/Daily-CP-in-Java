// https://leetcode.com/problems/total-waviness-of-numbers-in-range-ii/description/?envType=daily-question&envId=2026-06-05

class Solution {
    public static final int[] PATTERNS = new int[570];
    public static final int[] TYPES = new int[570];

    static {
        int idx = 0;
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    if ((j > i && j > k) || (j < i && j < k)) {
                        PATTERNS[idx] = i * 100 + j * 10 + k;
                        TYPES[idx] = (i == 0) ? 1 : 0;
                        idx++;
                    }
                }
            }
        }
    }

    public long totalWaviness(long num1, long num2) {
        return countWaviness(num2) - countWaviness(num1 - 1);
    }

    public long countWaviness(long n) {
        if (n < 100) return 0;

        long totalWays = 0;
        int len = String.valueOf(n).length();

        long[] pow10 = new long[len + 1];
        pow10[0] = 1;
        for (int i = 1; i <= len; i++) {
            pow10[i] = pow10[i - 1] * 10;
        }

        for (int p = 0; p < 570; p++) {
            int pattern = PATTERNS[p];
            int type = TYPES[p];

            for (int suffixLen = 0; suffixLen <= len - 3; suffixLen++) {
                long multiplier = pow10[suffixLen];

                long suffix = n % multiplier;
                long curr = (n / multiplier) % 1000;
                long prefix = n / (multiplier * 1000);

                if (curr > pattern) {
                    totalWays += Math.max(0, prefix + 1 - type) * multiplier;
                } else if (curr == pattern) {
                    totalWays += Math.max(0, prefix - type) * multiplier + (suffix + 1);
                } else {
                    totalWays += Math.max(0, prefix - type) * multiplier;
                }
            }
        }

        return totalWays;
    }
}
