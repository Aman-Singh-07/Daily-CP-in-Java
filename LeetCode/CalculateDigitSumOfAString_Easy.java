// https://leetcode.com/problems/calculate-digit-sum-of-a-string/description/?envType=daily-question&envId=2026-11-16

class Solution {
    public String digitSum(String s, int k) {
        while(s.length()>k){
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<s.length();i+=k){
                sb.append(sum(s.substring(i,Math.min(i+k,s.length()))));
            }
            s=sb.toString();
        }
        return s;
    }
    public String sum(String s){
        long res=0;
        for(char ch:s.toCharArray()){
            res+=ch-'0';
        }
        return String.valueOf((int) res);
    }
}
