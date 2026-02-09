// https://www.geeksforgeeks.org/problems/anagram-1587115620/1

class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        int[] c1=new int[26];
        int[] c2=new int[26];
        for(char ch:s1.toCharArray()){
            c1[ch-'a']++;
        }
        for(char ch:s2.toCharArray()){
            c2[ch-'a']++;
        }
        for(int i=0;i<26;i++){
            if(c1[i]!=c2[i]) return false;
        }
        return true;
    }
}
