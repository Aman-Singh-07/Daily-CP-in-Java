// https://leetcode.com/problems/process-string-with-special-operations-i/description/?envType=daily-question&envId=2026-06-16 

class Solution {
    public String processStr(String s) {
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(Character.isLowerCase(ch)) sb.append(ch);
            else if(ch=='*'){
                if(sb.length()>0){
                    sb.deleteCharAt(sb.length()-1);
                }
            }
            else if(ch=='#') sb.append(sb.toString());
            else sb.reverse();
        }
        return sb.toString();
        
    }
}
