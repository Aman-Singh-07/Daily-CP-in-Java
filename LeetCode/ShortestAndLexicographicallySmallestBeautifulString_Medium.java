// https://leetcode.com/problems/shortest-and-lexicographically-smallest-beautiful-string/description/?envType=daily-question&envId=2026-08-26

class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n = s.length();
        int minLength = Integer.MAX_VALUE;
        String res = "";
        int i = 0, count = 0;
        for (int j = 0; j < n; j++) {
            if (s.charAt(j) == '1') {
                count++;
            }
            while (count == k) {
                String sub = s.substring(i, j + 1);
                int len = sub.length();
                if (len < minLength) {
                    minLength = len;
                    res = sub;
                } else if (len == minLength && sub.compareTo(res) < 0) {
                    res = sub;
                }
                if (s.charAt(i) == '1') {
                    count--;
                }
                i++;
            }
        }
        return res;
    }
}
