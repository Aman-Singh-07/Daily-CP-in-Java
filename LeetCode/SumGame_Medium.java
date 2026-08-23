// https://leetcode.com/problems/sum-game/?envType=daily-question&envId=2026-08-23

class Solution {
    public boolean sumGame(String num) {
        int count1=0;
        int count2=0;
        long sum1=0;
        long sum2=0;
        for(int i=0;i<num.length()/2;i++){
            if(num.charAt(i)=='?') count1++;
            else sum1+=(num.charAt(i)-'0');
        }
        for(int i=num.length()/2;i<num.length();i++){
            if(num.charAt(i)=='?') count2++;
            else sum2+=(num.charAt(i)-'0');
        }
        long diff=sum1-sum2;
        long count=count2-count1;
        return diff*2!=count*9;
    }
}
