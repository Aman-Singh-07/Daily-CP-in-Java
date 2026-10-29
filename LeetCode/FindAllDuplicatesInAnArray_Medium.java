// https://leetcode.com/problems/find-all-duplicates-in-an-array/description/

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int num = Math.abs(nums[i]);
            int idx = num - 1;
            if(nums[idx]<0) res.add(num);
            else nums[idx] *= -1;
        }
        return res;
    }
}
