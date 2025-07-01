// https://leetcode.com/problems/find-the-original-typed-string-i/description/?envType=daily-question&envId=2025-07-01

class Solution {
    public int possibleStringCount(String word) {
        char[] ch=word.toCharArray();
        int count=0;
        for(int i=0;i<ch.length-1;i++){
            if(ch[i]==ch[i+1]) count++;   
        }
        return count+1;
        
    }
}
