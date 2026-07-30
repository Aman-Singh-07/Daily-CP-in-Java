// https://leetcode.com/problems/minimum-number-of-pushes-to-type-word-i/description/?envType=daily-question&envId=2026-07-30

class Solution {
    public int minimumPushes(String word) {
        int blocks=word.length()/8;
        return (blocks*(blocks + 1)*4)+(word.length() % 8)*(blocks + 1);
    }
}
