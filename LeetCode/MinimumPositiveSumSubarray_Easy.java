// https://leetcode.com/problems/minimum-positive-sum-subarray/?envType=daily-question&envId=2026-11-14

class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.size();i++){
            int res=0;
            int count=0;
            for(int j=i;j<=Math.min(i+r-1,nums.size()-1);j++){
                res+=nums.get(j);
                count++;
                if(count>=l){
                    if(res>0) min=Math.min(min,res);
                }
            }
        }
        if(min==Integer.MAX_VALUE) return -1;
        return min;
    }
}
