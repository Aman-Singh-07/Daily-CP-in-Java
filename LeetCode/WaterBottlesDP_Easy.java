// https://leetcode.com/problems/water-bottles/description/?envType=daily-question&envId=2025-10-01

class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int res=numBottles;
        while(numBottles>=numExchange){
            res+=numBottles/numExchange;
            int r=numBottles%numExchange;
            numBottles=((numBottles/numExchange)+r);
        }
        return res;
        
    }
}
