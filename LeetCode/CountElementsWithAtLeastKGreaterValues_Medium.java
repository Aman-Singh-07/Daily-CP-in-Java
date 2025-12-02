// https://leetcode.com/problems/count-elements-with-at-least-k-greater-values/description/

class Solution {
    public int countElements(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int count = 0;
        int i = 0;
        while (i < n) {
            int j = i;
            while (j < n && nums[j] == nums[i]) {
                j++;
            }
            int greater = n - j; 
            if (greater >= k) {
                count += (j - i); 
            }
            i = j; 
        }
        return count;
    }
}
