// https://www.geeksforgeeks.org/problems/non-repeating-character-1587115620/1?page=6&sortBy=submissions

class Solution {
    static char nonRepeatingChar(String s) {
        // code here
        int[] freq=new int[26];
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(freq[s.charAt(i)-'a']==1){
                return s.charAt(i);
            }
        }
        return '$';
    }
}
