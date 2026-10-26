// https://www.geeksforgeeks.org/problems/minimize-the-difference/1

class Solution {
    public int minDiff(int k, int[] arr) {
        int n = arr.length;
        if (n - k <= 1) return 0;
        int[] prefMax = new int[n];
        int[] prefMin = new int[n];
        prefMax[0] = arr[0];
        prefMin[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefMax[i] = Math.max(prefMax[i - 1], arr[i]);
            prefMin[i] = Math.min(prefMin[i - 1], arr[i]);
        }

        int[] suffMax = new int[n];
        int[] suffMin = new int[n];
        suffMax[n - 1] = arr[n - 1];
        suffMin[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffMax[i] = Math.max(suffMax[i + 1], arr[i]);
            suffMin[i] = Math.min(suffMin[i + 1], arr[i]);
        }

        int minDifference = Integer.MAX_VALUE;
        for (int i = 0; i <= n - k; i++) {
            int currentMax, currentMin;
            if (i == 0) {
                currentMax = suffMax[k];
                currentMin = suffMin[k];
            } 
            else if (i == n - k) {
                currentMax = prefMax[i - 1];
                currentMin = prefMin[i - 1];
            } 
            else {
                currentMax = Math.max(prefMax[i - 1], suffMax[i + k]);
                currentMin = Math.min(prefMin[i - 1], suffMin[i + k]);
            }

            minDifference = Math.min(minDifference, currentMax - currentMin);
        }

        return minDifference;
    }
}
