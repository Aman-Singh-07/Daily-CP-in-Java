// https://www.geeksforgeeks.org/problems/remove-character3815/1

class Solution {
    public String removeChars(String s1, String s2) {
        // code here
        StringBuilder sb=new StringBuilder();
        for(char ch:s1.toCharArray()){
            if(!s2.contains(ch+"")) sb.append(ch);
        }
        return sb.toString();
    }
}
