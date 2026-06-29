// https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/?envType=daily-question&envId=2026-06-29

class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count=0;
        for(String s:patterns){
            if(word.contains(s)) count++;
        }
        return count;
    }
}
