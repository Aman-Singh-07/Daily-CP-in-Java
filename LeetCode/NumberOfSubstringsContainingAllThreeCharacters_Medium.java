// https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/description/?envType=daily-question&envId=2026-06-30

class Solution {
    public int numberOfSubstrings(String s) {
        int i = 0;
        int count = 0;
        int[] freq = new int[3];
        for (int j = 0; j < s.length(); j++) {
            freq[s.charAt(j) - 'a']++;
            while (freq[0] >= 1 && freq[1] >= 1 && freq[2] >= 1) {
                count+=s.length()-j; 
                freq[s.charAt(i)-'a']--;
                i++;
            }
        }
        return count;
    }
}
