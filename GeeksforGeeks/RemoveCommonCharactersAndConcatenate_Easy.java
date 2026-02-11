// https://www.geeksforgeeks.org/problems/remove-common-characters-and-concatenate-1587115621/1

class Solution {
    public static String concatenatedString(String s1, String s2) {
        // code here
        StringBuilder sb=new StringBuilder();
        for(char c:s1.toCharArray()){
            if(s2.indexOf(c)==-1) sb.append(c);
        }
        for(char c:s2.toCharArray()){
            if(s1.indexOf(c)==-1) sb.append(c);
        }
        return sb.length()==0?"-1":sb.toString();
    }
}
