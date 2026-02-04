// https://www.geeksforgeeks.org/problems/buy-stock-2/1

class Solution {
    public int maxProfit(int[] prices) {
        // Code here
        int res=0;
        int[] prefix=new int[prices.length];
        int[] suffix=new int[prices.length];
        int min=prices[0];
        int max=prices[prices.length-1];
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min) min=prices[i];
            prefix[i]=min;
        }
        for(int i=prices.length-1;i>=0;i--){
            if(prices[i]>max) max=prices[i];
            suffix[i]=max;
        }
        for(int i=0;i<prices.length;i++){
            res=Math.max(Math.abs(prefix[i]-suffix[i]),res);
        }
        return res;
    }
}
