// https://leetcode.com/problems/unique-3-digit-even-numbers/?envType=daily-question&envId=2026-09-11

class Solution {
    public int totalNumbers(int[] digits) {
        int[] freq = new int[10];

        for (int digit : digits) {
            freq[digit]++;
        }

        int res = 0;
        for (int i = 1; i < freq.length; i++) {

            if (freq[i] == 0) {
                continue;
            }
            freq[i]--;
            for (int j = 0; j < freq.length; j++) {

                if (freq[j] == 0) {
                    continue;
                }
                freq[j]--;
                for (int k = 0; k < freq.length; k += 2) {
                    if (freq[k] == 0) {
                        continue;
                    }
                    res++;
                }
                freq[j]++;
            }
            freq[i]++;
        }

        return res;
    }
}
