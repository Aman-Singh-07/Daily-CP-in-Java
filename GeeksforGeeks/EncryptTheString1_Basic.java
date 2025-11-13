// https://www.geeksforgeeks.org/problems/encrypt-the-string-10337/1?page=9&status=unsolved&sortBy=difficulty

class Solution {
    String encryptString(String s) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            char currentChar = s.charAt(i);
            int count = 1;
            while (i + 1 < s.length() && s.charAt(i + 1) == currentChar) {
                count++;
                i++;
            }
            sb.append(currentChar).append(count);
            i++;
        }
        return sb.reverse().toString();
    }
}
