// https://leetcode.com/problems/find-the-largest-almost-missing-integer/description/?envType=daily-question&envId=2026-08-18

class Solution {
    public int largestInteger(int[] nums, int k) {
        if (k == nums.length) {
            int max = -1;
            for (int num : nums) {
                max = Math.max(max, num);
            }
            return max;
        } 
        else if (k >= 2) {
            int count1 = 0;
            int count2 = 0;

            for (int num : nums) {
                if (num == nums[0]) count1++;
                if (num == nums[nums.length-1]) count2++;
            }
            int max = -1;
            if (count1 == 1) max = Math.max(max, nums[0]);
            if (count2 == 1) max = Math.max(max, nums[nums.length-1]);
            return max;
        } 
        else {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int num : nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            int max = -1;
            for (Map.Entry<Integer, Integer> em : map.entrySet()) {
                if (em.getValue() == 1) {
                    max = Math.max(em.getKey(), max);
                }
            }
            return max;
        }
    }
}
