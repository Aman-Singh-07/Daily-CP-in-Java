// https://www.geeksforgeeks.org/problems/max-absolute-difference4114/1

class Solution {
    public int maxDiffSubArrays(int[] arr) {
        int n = arr.length;

        int[] leftMax = new int[n], leftMin = new int[n], rightMax = new int[n], rightMin = new int[n];

        leftMax[0] = leftMin[0] = arr[0];
        rightMax[n - 1] = rightMin[n - 1] = arr[n - 1];

        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(arr[i], leftMax[i - 1] + arr[i]);
            leftMin[i] = Math.min(arr[i], leftMin[i - 1] + arr[i]);
        }

        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(arr[i], rightMax[i + 1] + arr[i]);
            rightMin[i] = Math.min(arr[i], rightMin[i + 1] + arr[i]);
        }

        int ans = 0;
        for (int i = 0; i < n - 1; i++) {
            ans = Math.max(ans, Math.abs(leftMax[i] - rightMin[i + 1]));
            ans = Math.max(ans, Math.abs(leftMin[i] - rightMax[i + 1]));
        }

        return ans;
    }
}

