// https://www.geeksforgeeks.org/problems/maximum-sum-increasing-subsequence4749/1

class Solution {
    public int maxSumIS(int arr[]) {
        int n = arr.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = arr[i];
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    res[i] = Math.max(res[i], res[j] + arr[i]);
                }
            }
        }
        
        int max = res[0];
        for (int i = 1; i < n; i++) {
            max = Math.max(max, res[i]);
        }
        return max;
    }
}
