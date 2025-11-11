// https://www.geeksforgeeks.org/problems/nearest-multiple-of-102437/1?page=1&difficulty=Easy&status=unsolved&sortBy=difficulty

class Solution {
    String roundToNearest(String s) {
        int len = s.length();
        char lastDigit = s.charAt(len - 1);
        if (lastDigit == '0') return s;
        String prefix = s.substring(0, len - 1);
        if (lastDigit >= '6') {
            StringBuilder sb = new StringBuilder(prefix);
            int i = sb.length() - 1;
            while (i >= 0) {
                char ch = sb.charAt(i);
                if (ch == '9') {
                    sb.setCharAt(i, '0');
                    i--;
                } else {
                    sb.setCharAt(i, (char)(ch + 1));
                    break;
                }
            }
            if (i < 0) sb.insert(0, '1'); 
            return sb.toString() + '0';
        } else {
            return prefix + '0';
        }
    }
}
