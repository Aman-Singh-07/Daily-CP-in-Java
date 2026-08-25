// https://leetcode.com/problems/smallest-missing-multiple-of-k/description/?envType=daily-question&envId=2026-08-25

class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int res=k;
        int i=1;
        while(set.contains(res*i)) i++;
        return res*i;
    }
}

