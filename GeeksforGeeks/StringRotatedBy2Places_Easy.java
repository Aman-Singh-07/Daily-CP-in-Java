//  https://www.geeksforgeeks.org/problems/check-if-string-is-rotated-by-two-places-1587115620/1

class Solution {
    public static boolean isRotated(String s1, String s2) {
        // code here
        if(s1.length()==1) return s1.equals(s2);
        String s=s1.substring(2,s1.length())+s1.substring(0,2);
        String ss=s1.substring(s1.length()-2,s1.length())+s1.substring(0,s1.length()-2);
        return s.equals(s2) || ss.equals(s2);
    }
}
