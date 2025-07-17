// https://leetcode.com/problems/valid-word/?envType=daily-question&envId=2025-07-15

class Solution {
    public boolean isValid(String word) {
        int countVowel=0;
        int countConsonant=0;
        boolean isTrue=false;
        for(char ch:word.toCharArray()){
            if(!Character.isDigit(ch) && !Character.isLetter(ch)){
                return false;
            }
            else if((ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') ){
                countVowel++;
            }
            else if(!Character.isDigit(ch)) countConsonant++;
        }

        return ((countVowel>0 && countConsonant>0 && word.length()>2)?true:false);
    }
}
