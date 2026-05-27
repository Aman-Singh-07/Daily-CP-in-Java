// https://leetcode.com/problems/count-the-number-of-special-characters-ii/?envType=daily-question&envId=2026-05-27

class Solution {
    public int numberOfSpecialChars(String word) {
        int[] lower=new int[26];
        int[] upper=new int[26];
        int count=0;
        int[] freq=new int[26];
        for(char ch:word.toCharArray()){
            if(Character.isLowerCase(ch)){
                freq[ch-'a']++;
            }
        }
        for(int i=0;i<word.length();i++){
            if(Character.isLowerCase(word.charAt(i))){
                lower[word.charAt(i)-'a']++;
            }else{
                if(lower[word.charAt(i)-'A']==freq[word.charAt(i)-'A'] && lower[word.charAt(i)-'A']>0 && upper[word.charAt(i)-'A']==0) count++;
                upper[word.charAt(i)-'A']++;
            }
        }
        return count;
    }
}
