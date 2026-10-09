// https://leetcode.com/problems/minimum-insertions-to-balance-a-parentheses-string/description/?envType=daily-question&envId=2026-10-09

class Solution {
    public int minInsertions(String s) {
        int temp = 0;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                temp += 2;
                if (temp % 2 != 0) {
                    temp--;
                    count++;
                }
            } else {
                temp--;
                if (temp < 0) {
                    count++;
                    temp = 1;
                }
            }
        }

        return count + temp;
    }
}
