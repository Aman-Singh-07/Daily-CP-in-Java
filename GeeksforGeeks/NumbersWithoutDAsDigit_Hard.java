// https://www.geeksforgeeks.org/problems/count-numbers2004/1

class Solution {
    public int countWithout(int n, int d) {
        if (n <= 0) return 0;

        String s = String.valueOf(n);
        int len = s.length();
        int count = 0;

        for (int i = 1; i < len; i++) {
            int choicesFirst = (d == 0) ? 9 : 8;
            count += choicesFirst * (int) Math.pow(9, i - 1);
        }

        for (int i = 0; i < len; i++) {
            int currentDigit = s.charAt(i) - '0';
            int start = (i == 0) ? 1 : 0;

            int allowedChoices = 0;
            for (int digit = start; digit < currentDigit; digit++) {
                if (digit != d) {
                    allowedChoices++;
                }
            }

            count += allowedChoices * (int) Math.pow(9, len - 1 - i);

            if (currentDigit == d) {
                return count;
            }
        }

        if (!s.contains(String.valueOf(d))) {
            count++;
        }

        return count;
    }
}
