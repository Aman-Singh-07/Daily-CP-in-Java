// https://leetcode.com/problems/unique-morse-code-words/description/

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] st={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> set=new HashSet<>();
        for(String s:words){
            StringBuilder sb=new StringBuilder();
            for(char ch:s.toCharArray()){
                sb.append(st[ch-'a']);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}
