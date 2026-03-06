// https://leetcode.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones/description/?envType=daily-question&envId=2026-03-06

class Solution {
    public boolean checkOnesSegment(String s) {
        return !s.contains("01");
    }
}
