// https://leetcode.com/problems/shuffle-string/description/

class Solution {
    public String restoreString(String s, int[] indices) {
        int length=s.length();
         char ch[]=new char[length];
        for(int i=0;i<length;i++){
            ch[indices[i]]=s.charAt(i);

        }
        return new String(ch);
    }
}
