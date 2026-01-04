//  https://leetcode.com/problems/minimum-cost-to-make-two-binary-strings-equal/description/

class Solution {
    public long minimumCost(String s, String t, int flipCost, int swapCost, int crossCost) {
        long sum=0;
        long count10=0;
        long count01=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=t.charAt(i)){
            if(s.charAt(i)=='0') count01++;
            else count10++;   
            }
        }
        long c1=Math.min(swapCost,2L*flipCost);
        long c2=Math.min((long) swapCost + crossCost,2L*flipCost);
        sum+=((long) Math.min(count10,count01))*c1;
        sum+=(((long) Math.abs(count01-count10))/2)*c2;
        sum+=extra(count01,count10,flipCost);
        return sum;
        
    }
    public static long extra(long count1, long count2, long flipCost){
        return ((long) Math.abs(count1-count2))%2!=0?flipCost:0;
    }
}
