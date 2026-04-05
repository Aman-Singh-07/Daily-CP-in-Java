// https://leetcode.com/problems/mirror-frequency-distance/description/

class Solution {
    public int mirrorFrequency(String s) {
        int res=0;
        int[] freq=new int[26];
        int[] f=new int[10];
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                f[ch-'0']++;
            }
            else{
                freq[ch-'a']++;
            }
        }
        for(int i=0;i<13;i++){
            res+=Math.abs(freq[i]-freq[26-i-1]);
        }
        for(int i=0;i<=4;i++){
            res+=Math.abs(f[i]-f[10-i-1]);
        }
        return res;
    }
}
