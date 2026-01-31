// https://leetcode.com/problems/find-smallest-letter-greater-than-target/?envType=daily-question&envId=2026-01-31

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for(char ch:letters){
            if(ch>target) return ch;
        }
        return letters[0];
    }
}
