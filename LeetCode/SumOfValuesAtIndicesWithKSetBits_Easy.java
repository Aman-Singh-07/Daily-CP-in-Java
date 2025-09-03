// https://leetcode.com/problems/sum-of-values-at-indices-with-k-set-bits/description/?envType=problem-list-v2&envId=n32iyzu3

class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum=0;
        for(int i=0;i<nums.size();i++){
            if(Integer.bitCount(i)==k){
                sum+=nums.get(i);
            }
        }
        return sum;
        
    }
}
