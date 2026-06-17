// https://leetcode.com/problems/process-string-with-special-operations-ii/?envType=daily-question&envId=2026-06-17

// I have written the comments to understand the entire process of the code and it's execution.
// Just Follow the entire commented line and get logic.
class Solution {
    public char processStr(String s, long k) {
        int n = s.length();
        long[] lengths = new long[n];
        long currentLength = 0;

        // Step 1: Compute the logical length of the string at every forward step
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (Character.isLowerCase(ch)) {
                currentLength++;
            } else if (ch == '*') {
                if (currentLength > 0) {
                    currentLength--;
                }
            } else if (ch == '#') {
                currentLength *= 2;
            } else {
                // Reverse operation ('%') does not change the total length
            }
            lengths[i] = currentLength;
        }

        // Out of bounds check
        if (k >= currentLength) {
            return '.';
        }

        // Step 2: Reverse-engineer index 'k' from the end of the operations string
        long targetIndex = k;
        for (int i = n - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            long prevLength = (i > 0) ? lengths[i - 1] : 0;

            if (Character.isLowerCase(ch)) {
                // If the lowercase char was appended right at our target index, this is it!
                if (targetIndex == prevLength) {
                    return ch;
                }
            } else if (ch == '*') {
                // Backspace doesn't shift existing valid indices, it just truncated the past state
                continue;
            } else if (ch == '#') {
                // If index is in the second half (the copy), map it back to the first half
                if (targetIndex >= prevLength) {
                    targetIndex -= prevLength;
                }
            } else {
                // Reverse operation: invert the index based on the string length at that moment
                targetIndex = prevLength - 1 - targetIndex;
            }
        }

        return '.';
    }
}
