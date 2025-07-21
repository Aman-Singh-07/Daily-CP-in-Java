// https://leetcode.com/problems/delete-characters-to-make-fancy-string/?envType=daily-question&envId=2025-07-21

class Solution {
    public String makeFancyString(String s) {
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length-2;i++){
            if(ch[i]==ch[i+1] && ch[i+1]==ch[i+2]) ch[i]='0';
        }
        StringBuilder sb=new StringBuilder();
        for(char c:ch){
            if(c!='0') sb.append(c);
        }
        return sb.toString();
    }
}
