//  https://leetcode.com/problems/minimum-increase-to-maximize-special-indices/description/

class Solution {
    public long minIncrease(int[] nums) {
        long res1 = 0;
        long res2 = 0;
        if (nums.length % 2 != 0) {
            for (int i = 1; i < nums.length - 1; i += 2) {
                if (nums[i] <= nums[i - 1] || nums[i] <= nums[i + 1]) {
                    int max = Math.max(nums[i + 1], nums[i - 1]);
                    res1 += max - nums[i] + 1;
                }
            }
            return res1;
        } else {
            long temp1 = 0;
            ArrayList<Integer> list1 = new ArrayList<>();
            ArrayList<Integer> list2 = new ArrayList<>();
            for (int i = 1; i < nums.length - 2; i += 2) {
                if (nums[i] <= nums[i - 1] || nums[i] <= nums[i + 1]) {
                    int max = Math.max(nums[i + 1], nums[i - 1]);
                    list1.add(max - nums[i] + 1);
                    temp1 += (max - nums[i] + 1);
                }
            }

            long temp2 = temp1;
            for (int i = nums.length - 3; i >= 1; i -= 2) {
                if (nums[i] <= nums[i - 1] || nums[i] <= nums[i + 1]) {
                    int max = Math.max(nums[i + 1], nums[i - 1]);

                    temp1 -= (max - nums[i] + 1);
                }
                if (nums[i + 1] <= nums[i] || nums[i + 1] <= nums[i + 2]) {
                    int max = Math.max(nums[i + 2], nums[i]);
                    list2.add(max - nums[i + 1] + 1);
                    temp1 += max - nums[i + 1] + 1;
                }
                temp2 = Math.min(temp2, temp1);
            }
            return temp2;

        }
    }
}
