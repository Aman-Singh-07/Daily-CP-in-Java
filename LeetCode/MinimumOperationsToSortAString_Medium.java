// https://leetcode.com/problems/minimum-operations-to-sort-a-string/description/

class Solution {
    public int minOperations(String s) {
        char[] ch=s.toCharArray();
        int n=s.length();
        Arrays.sort(ch);
        String temp=new String(ch);
        if(s.equals(temp)) return 0;
        if(s.charAt(0)!=temp.charAt(0) && s.charAt(n-1)!=temp.charAt(n-1)){
            if(n==2) return -1;
            if(s.charAt(0)==temp.charAt(n-1) && s.charAt(n-1)==temp.charAt(0)){
                if(temp.charAt(0)!=temp.charAt(1) && temp.charAt(n-1)!=temp.charAt(n-2)) return 3;
                else return 2;
            }
            else return 2;
        }
        return 1;
    }
}
