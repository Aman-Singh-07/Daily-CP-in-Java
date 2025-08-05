// https://leetcode.com/problems/fruits-into-baskets-ii/?envType=daily-question&envId=2025-08-05

class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int count=fruits.length;
        for(int i=0;i<fruits.length;i++){
            for(int j=0;j<baskets.length;j++){
                if(fruits[i]<=baskets[j]){
                    count--;
                    baskets[j]=0;
                    break;
                }
            }
        }
        return count;
        
    }
}
