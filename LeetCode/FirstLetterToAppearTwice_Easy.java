// https://leetcode.com/problems/first-letter-to-appear-twice/

class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> set=new HashSet<>();
        for(char ch:s.toCharArray()){
            if(set.contains(ch)) return ch;
            set.add(ch);
        }
        return '0';
       
    }
}
