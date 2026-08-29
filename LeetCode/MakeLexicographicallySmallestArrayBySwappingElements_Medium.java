// https://leetcode.com/problems/make-lexicographically-smallest-array-by-swapping-elements/description/?envType=daily-question&envId=2026-08-29

class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n = nums.length;
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        HashMap<Integer, Integer> group = new HashMap<>();
        HashMap<Integer, Integer> idx = new HashMap<>();
        int[] res = new int[n];
        int grp = 0;
        group.put(sorted[0], grp);
        idx.put(grp, 0);
        for(int i=1;i<n;i++){
            if(sorted[i] - sorted[i-1] > limit){
                grp++;
                idx.put(grp, i);
            }
            group.put(sorted[i], grp);
        }

        int i = 0;
        while(i < n){
            int currgrp = group.get(nums[i]);
            int j = idx.get(currgrp);
            res[i] = sorted[j];
            idx.put(currgrp, j + 1);
            i++;
        }

        return res;
    }
}
