// https://leetcode.com/problems/length-of-longest-subarray-with-at-most-k-frequency/description/?envType=daily-question&envId=2026-08-12

class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        while (j < nums.length) {
            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
            while (map.get(nums[j]) > k) {
                map.put(nums[i], map.getOrDefault(nums[i], 0) - 1);
                i++;
            }
            count = Math.max(count, j - i + 1);
            j++;
        }
        return count;
    }
}
