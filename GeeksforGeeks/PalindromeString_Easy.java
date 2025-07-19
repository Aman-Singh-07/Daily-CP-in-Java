// https://www.geeksforgeeks.org/problems/palindrome-string0817/1?page=3&sortBy=submissions

class Solution {
    boolean isPalindrome(String s) {
        // code here
        for(int i=0;i<=s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)) return false;
        }
        return true;
    }
}
