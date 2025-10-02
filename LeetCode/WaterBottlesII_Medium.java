// https://leetcode.com/problems/water-bottles-ii/description/?envType=daily-question&envId=2025-10-02

class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int res=numBottles;
        int empty=numBottles;
        while(empty>=numExchange){
            empty-=numExchange;
            numExchange++;
            res++;
            empty++;
        }
        return res;
    }
}
