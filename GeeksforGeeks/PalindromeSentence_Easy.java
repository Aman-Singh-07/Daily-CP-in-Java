// https://www.geeksforgeeks.org/problems/string-palindromic-ignoring-spaces4723/1

class Solution {
    public boolean isPalinSent(String s) {
        // code here
        String[] str=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(Character.isLetter(ch) || Character.isDigit(ch)){
                sb.append(Character.toLowerCase(ch));
            }
        }
        return isPalindrome(sb.toString(),0,sb.length()-1);
    }
    
    public boolean isPalindrome(String s,int left,int right){
        if(left>=right) return true;
        
        return (s.charAt(left)==s.charAt(right) && isPalindrome(s,(left+1),(right-1)));
        
    }
}
