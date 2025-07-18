// https://leetcode.com/problems/number-of-equivalent-domino-pairs/description/?envType=daily-question&envId=2025-05-04

class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int count=0;
        for(int i=0;i<dominoes.length;i++){
           int a1=(Math.min(dominoes[i][0],dominoes[i][1]));
           int b1=(Math.max(dominoes[i][0],dominoes[i][1]));
           for(int j=i+1;j<dominoes.length;j++){
            int a2=(Math.min(dominoes[j][0],dominoes[j][1]));
            int b2=(Math.max(dominoes[j][0],dominoes[j][1]));
            if(a1==a2 && b1==b2){
                count++;
            }
           }
           
        }
        return count;
        
    }
}
