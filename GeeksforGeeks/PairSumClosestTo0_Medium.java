// https://www.geeksforgeeks.org/problems/two-numbers-with-sum-closest-to-zero1737/1?page=1&difficulty=Medium&status=unsolved&sortBy=difficulty

class Solution {
    public static int closestToZero(int arr[], int n) {
        Arrays.sort(arr); 
        int left = 0, right = n - 1;
        int closest = Integer.MAX_VALUE;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (Math.abs(sum) < Math.abs(closest) ||
               (Math.abs(sum) == Math.abs(closest) && sum > closest)) {
                closest = sum;
            }

            if (sum < 0) {
                left++;
            } else {
                right--;
            }
        }

        return closest;
    }
}
