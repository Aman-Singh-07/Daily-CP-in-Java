// https://leetcode.com/problems/check-if-digits-are-equal-in-string-after-operations-i/?envType=problem-list-v2&envId=n32iyzu3

class Solution {
    public boolean hasSameDigits(String s) {
        StringBuilder res=new StringBuilder(s);
        while(res.length()!=2){
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<res.length()-1;i++){
                int sum=(res.charAt(i)-'0')+(res.charAt(i+1)-'0');
                sb.append(sum%10);
            }
            res=sb;
        }
        return res.charAt(0)==res.charAt(1);
        
    }
}
