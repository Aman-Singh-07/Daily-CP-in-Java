// https://leetcode.com/problems/find-the-difference/

class Solution {
    public char findTheDifference(String s, String t) {
        char[] char1=s.toCharArray();
        char[] char2=t.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        for (int i=0;i<char1.length;i++){
            if(char1[i]!=char2[i]){
                return char2[i];
            }
        }
        return char2[char2.length-1];
    }
}
