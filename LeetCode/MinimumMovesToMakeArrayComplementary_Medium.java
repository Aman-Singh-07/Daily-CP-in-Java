// https://leetcode.com/problems/minimum-moves-to-make-array-complementary/description/?envType=daily-question&envId=2026-05-13

class Solution {
    public int minMoves(int[] nums, int limit) {
        int[] d = new int[2 * limit + 2];
        int n = nums.length;

        for (int i = 0; i < n / 2; i++) {
            int a = nums[i];
            int b = nums[n - 1 - i];

            int s1 = Math.min(a, b) + 1;
            int s2 = Math.max(a, b) + limit;
            int sum = a + b;

            d[2] += 2;
            d[2 * limit + 1] -= 2;

            d[s1] -= 1;
            d[s2 + 1] += 1;

            d[sum] -= 1;
            d[sum + 1] += 1;
        }

        int res = n;
        int curr = 0;
        for (int i = 2; i <= 2 * limit; i++) {
            curr += d[i];
            if (curr < res) {
                res = curr;
            }
        }

        return res;
    }
}
