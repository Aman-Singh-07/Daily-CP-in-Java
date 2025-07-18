// https://leetcode.com/problems/reverse-words-in-a-string-iii/

class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            StringBuilder reversed = new StringBuilder(word).reverse();
            result.append(reversed);
            if (i != words.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}
