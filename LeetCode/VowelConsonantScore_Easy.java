// https://leetcode.com/problems/vowel-consonant-score/

class Solution {
    public int vowelConsonantScore(String s) {
        int v=0;
        int c=0;
        for(char ch:s.toCharArray()){
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') v++;
            else if(Character.isLetter(ch)) c++;
        }
        if(c>0) return v/c;
        return 0;
    }
}
