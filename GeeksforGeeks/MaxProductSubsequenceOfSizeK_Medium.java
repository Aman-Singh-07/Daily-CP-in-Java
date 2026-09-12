// https://www.geeksforgeeks.org/problems/maximum-product4633/1

class Solution {
    public int maxProduct(int[] arr, int k) {
        Arrays.sort(arr);
        int n = arr.length;
        if (k == 0) return 1;
        int prod = 1;
        if (k % 2 != 0) {
            if (arr[n - 1] == 0) {
                return 0;
            } else if (arr[n - 1] < 0) {
                for (int i = n - 1; i >= n - k; i--) {
                    prod *= arr[i];
                }
                return prod;
            } else {
                prod *= arr[n - 1];
                k--;
                n--;
            }
        }
        int i = 0;
        int j = n - 1;
        while (k > 0) {
            int left_pair = arr[i] * arr[i + 1];
            int right_pair = arr[j] * arr[j - 1];
            if (left_pair > right_pair) {
                prod *= left_pair;
                i += 2;
            } else {
                prod *= right_pair;
                j -= 2;
            }
            k -= 2;
        }

        return prod;
    }
}
