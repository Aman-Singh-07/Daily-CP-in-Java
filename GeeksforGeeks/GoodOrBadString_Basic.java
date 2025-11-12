// https://www.geeksforgeeks.org/problems/good-or-bad-string1417/1?page=9&status=unsolved&sortBy=difficulty

class Solution {
    static int isGoodorBad(String S) {
        int countV = 0;
        int countC = 0;
        String vowels = "aeiou";

        for (char c : S.toCharArray()) {
            if (c == '?') {
                
                countV++;
                countC++;
            } else if (vowels.indexOf(c) != -1) {
                countV++;
                countC = 0;
            } else {
                countC++;
                countV = 0;
            }

            if (countV > 5 || countC > 3) return 0; 
        }
        return 1;
    }
}
