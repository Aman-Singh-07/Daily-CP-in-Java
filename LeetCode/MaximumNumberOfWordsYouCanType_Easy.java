// https://leetcode.com/problems/maximum-number-of-words-you-can-type/description/?envType=daily-question&envId=2025-09-15

class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int count=0;
        char[] ch=brokenLetters.toCharArray();
        String[] s=text.split(" ");
        
        for(String st:s){
            boolean isTrue=true;
            for(char c:ch){
                if(st.contains(String.valueOf(c))){
                    isTrue=false;
                }
            }
            if(isTrue) count++;
        }
        return count;
        
    }
}
