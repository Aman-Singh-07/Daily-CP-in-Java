// https://leetcode.com/problems/stone-game-viii/?envType=daily-question&envId=2026-08-24

class Solution {
    public int stoneGameVIII(int[] stones) {
        int res=0;
        int[] prefix=new int[stones.length];
        prefix[0]=stones[0];
        for(int i=i=1;i<stones.length;i++){
            prefix[i]=prefix[i-1]+stones[i];
        }
        res=prefix[stones.length-1];
        for(int i=stones.length-2;i>=1;i--){
            res=Math.max(res,prefix[i]-res);
        }
        return res;
    }
}
