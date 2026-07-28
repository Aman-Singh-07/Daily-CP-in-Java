// https://leetcode.com/problems/smallest-palindromic-rearrangement-i/?envType=daily-question&envId=2026-07-28

class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        char[] res = new char[n];
        TreeMap<Character, Integer> map = new TreeMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int left = 0, right = n - 1;
        char middleChar = 0;

        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            char ch = e.getKey();
            int count = e.getValue();
            if (count % 2 == 1) {
                middleChar = ch;
                count--;
            }
            for (int k = 0; k < count / 2; k++) {
                res[left++] = ch;
                res[right--] = ch;
            }
        }
        if (middleChar != 0) {
            res[left] = middleChar;
        }
        return new String(res);
    }
}
