// https://www.geeksforgeeks.org/problems/the-modified-string-1587115621/1

class Solution {
    public int modified(String s) {
        //  code here
        if(s.length()<=2) return 0;
        int count=0;
        for(int i=1;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i-1) && s.charAt(i)==s.charAt(i+1)){
                count++;
                i++;
            }
        }
        return count;
    }
}
