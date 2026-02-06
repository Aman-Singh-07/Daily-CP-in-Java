// https://leetcode.com/problems/minimum-removals-to-balance-array/?envType=daily-question&envId=2026-02-06

import java.util.*;
class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int maxWindow=0;
        int j=0;
        for(int i=0;i<n;i++){
            while (j<n && nums[j]<=(long) nums[i]*k){
                j++;
            }
            maxWindow=Math.max(maxWindow,j-i);
        }
        return n-maxWindow;
    }
}
