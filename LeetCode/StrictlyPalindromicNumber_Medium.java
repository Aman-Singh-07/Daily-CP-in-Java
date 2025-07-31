// https://leetcode.com/problems/strictly-palindromic-number/description/?envType=problem-list-v2&envId=n32iyzu3

class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for(int i=2;i<n-1;i++){
            String s=binString(n,i);
            if(!isPalindrome(s,0,s.length()-1)) return false;
        }
        return true;
    }

    public static boolean isPalindrome(String s,int left,int right){
        if(left>=right) return true;
        return (s.charAt(left)==s.charAt(right) && isPalindrome(s,left+1,right-1));

    }

    public static String binString(int n,int base){
        StringBuilder sb=new StringBuilder();
        while(n>0){
            sb.append(n%base);
            n/=base;
        }
        return sb.reverse().toString(); 
    }
}
