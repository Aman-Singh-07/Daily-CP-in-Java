// https://leetcode.com/problems/minimum-operations-to-convert-all-elements-to-zero/description/?envType=daily-question&envId=2025-11-10

class Solution {
    public int minOperations(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        for (int n : nums) {
            while (!stack.isEmpty() && stack.peek() > n)
                stack.pop();
            if (n == 0)
                continue;
            if (stack.isEmpty() || stack.peek() < n) {
                res++;
                stack.push(n);
            }
        }
        return res;
    }
}
