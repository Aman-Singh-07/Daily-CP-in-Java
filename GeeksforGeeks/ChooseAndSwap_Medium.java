// https://www.geeksforgeeks.org/problems/choose-and-swap0531/1

class Solution {
    public String chooseSwap(String s) {
        int[] firstOccur = new int[26];
        java.util.Arrays.fill(firstOccur, -1);
        
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int idx = chars[i] - 'a';
            if (firstOccur[idx] == -1) {
                firstOccur[idx] = i;
            }
        }
        char ch1 = ' ', ch2 = ' ';
        for (int i = 0; i < chars.length; i++) {
            char curr = chars[i];
            boolean found = false;
            for (int j = 0; j < curr - 'a'; j++) {
                if (firstOccur[j] > i) {
                    ch1 = curr;
                    ch2 = (char) (j + 'a');
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }
        if (ch1 != ' ') {
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == ch1) {
                    chars[i] = ch2;
                } else if (chars[i] == ch2) {
                    chars[i] = ch1;
                }
            }
        }
        
        return new String(chars);
    }
}
