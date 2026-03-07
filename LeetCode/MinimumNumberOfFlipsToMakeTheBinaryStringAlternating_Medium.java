// https://leetcode.com/problems/minimum-number-of-flips-to-make-the-binary-string-alternating/description/?envType=daily-question&envId=2026-03-07

class Solution {
    public int minFlips(String s) {
        String res=s+s;
        int count=Integer.MAX_VALUE;
        int c1=0;
        int c2=0;
        for(int i=0;i<2*s.length();i++){
            if(res.charAt(i)-'0'!=(i%2)) c1++;
            else c2++;
            if(i>=s.length()){
                if(res.charAt(i-s.length())-'0'!=(i-s.length())%2) c1--;
                else c2--;
            }
            if(i>=s.length()-1){
                count=Math.min(count,Math.min(c1,c2));
            }
        }
        return count;
    }
}
