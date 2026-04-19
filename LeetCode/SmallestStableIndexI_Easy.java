// https://leetcode.com/problems/smallest-stable-index-i/

class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] prefix=new int[nums.length];
        int[] suffix=new int[nums.length];
        int max=nums[0];
        int min=nums[nums.length-1];
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            prefix[i]=max;
        }
        for(int i=nums.length-1;i>=0;i--){
            min=Math.min(min,nums[i]);
            suffix[i]=min;
        }
        for(int i=0;i<nums.length;i++){
            if(prefix[i]-suffix[i]<=k) return i;
        }
        return -1;
    }
}
