// https://leetcode.com/problems/jump-game-ix/?envType=daily-question&envId=2026-05-07

class Solution {
    public int[] maxValue(int[] nums) {
        int[] prefix=new int[nums.length];
        int[] suffix=new int[nums.length];
        prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i]=Math.max(prefix[i-1],nums[i]);
        }
        suffix[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            suffix[i]=Math.min(suffix[i+1],nums[i]);
        }
        int[] res=new int[nums.length];
        res[nums.length-1]=prefix[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            if(prefix[i]>suffix[i+1]) res[i]=res[i+1];
            else res[i]=prefix[i];
        }
        return res;
    }
}
