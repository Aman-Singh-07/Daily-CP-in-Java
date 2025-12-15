// https://leetcode.com/problems/number-of-smooth-descent-periods-of-a-stock/description/?envType=daily-question&envId=2025-12-15

class Solution {
    public long getDescentPeriods(int[] prices) {
        long res=0;
        long count=1;
        for(int i=0;i<prices.length;i++){
            if(i>0 && prices[i-1]-prices[i]==1){
                count++;
            }else{
                count=1;
            }
            res+=count;
        }
        return res;
    }
}
