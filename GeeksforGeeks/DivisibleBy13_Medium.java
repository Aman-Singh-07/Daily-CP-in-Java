// https://www.geeksforgeeks.org/problems/divisible-by-13/1

class Solution {
    public boolean divby13(String s) {
        int mod = 0;
        for (int i=0;i<s.length();i++){
            mod=(mod*10+(s.charAt(i)-'0'))%13;
        }
        return mod==0;
    }
}
