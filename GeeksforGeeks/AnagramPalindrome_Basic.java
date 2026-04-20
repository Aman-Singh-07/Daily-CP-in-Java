// https://www.geeksforgeeks.org/problems/anagram-palindrome4720/1

class Solution {
    boolean canFormPalindrome(String s) {
        // code here
        int[] freq=new int[26];
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(freq[i]%2!=0) count++;
            if(count>1) return false;
        }
        return true;
    }
}
