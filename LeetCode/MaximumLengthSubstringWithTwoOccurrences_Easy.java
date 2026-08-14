// https://leetcode.com/problems/maximum-length-substring-with-two-occurrences/description/?envType=daily-question&envId=2026-08-14

class Solution {
    public int maximumLengthSubstring(String s) {
        int max=0;
        int i=0;
        int j=0;
        int[] freq=new int[26];
        while(j<s.length()){
            freq[s.charAt(j)-'a']++;
            while(freq[s.charAt(j)-'a']>2){
                freq[s.charAt(i)-'a']--;
                i++;
            }
            max=Math.max(max,j-i+1);
            j++;
        }
        return max;
    }
}
