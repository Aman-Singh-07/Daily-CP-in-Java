// https://leetcode.com/problems/maximum-ice-cream-bars/description/?envType=daily-question&envId=2026-06-21

class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int maxCost = 0;
        for (int cost : costs) {
            if (cost > maxCost) {
                maxCost = cost;
            }
        }
        
        int[] freq = new int[maxCost + 1];
        for (int cost : costs) {
            freq[cost]++;
        }
        
        int count = 0;
    
        for (int cost = 1; cost <= maxCost; cost++) {
            if (freq[cost] == 0) continue;
            if (coins < cost) break; 
        
            int canBuy = Math.min(freq[cost], coins / cost);
            coins -= canBuy * cost;
            count += canBuy;
        }
        
        return count;
    }
}
