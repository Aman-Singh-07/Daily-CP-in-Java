// https://leetcode.com/problems/lexicographically-smallest-string-after-deleting-duplicate-characters/

class Solution {
    public String lexSmallestAfterDeletion(String s) {
        int[] c=new int[26];
        for(char ch:s.toCharArray()){
            c[ch-'a']++;
        }
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            find(sb,c,ch,0);
            sb.append(ch);
        }
        find(sb,c,'a',1);
        return sb.toString();
        
        
    }

    public static void find(StringBuilder sb,int[] c,char ch,int x){
        while(sb.length()>0){
            char l=sb.charAt(sb.length()-1);
            if(x==0?(l>ch && c[l-'a']>1):(c[l-'a']>1)){
                c[l-'a']--;
                sb.deleteCharAt(sb.length()-1);
            }else break;
        }
    }
    
}

