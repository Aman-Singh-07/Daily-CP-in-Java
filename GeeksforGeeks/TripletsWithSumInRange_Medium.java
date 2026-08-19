// https://www.geeksforgeeks.org/problems/triplets-with-sum-with-given-range/1

class Solution {
     public int countTriplets(int[] arr, int l, int r) {
         return countLessThanOrEqual(arr, r) - countLessThanOrEqual(arr, l - 1);
     }
     public int countLessThanOrEqual(int[] arr, int target) {
         int count = 0;
         int n = arr.length;
         Arrays.sort(arr); 
         for (int i = 0; i < n - 2; i++) {
             int left = i + 1;
             int right = n - 1;
             while (left < right) {
                 int currentSum = arr[i] + arr[left] + arr[right];

                 if (currentSum <= target) {
                     count += (right - left);
                     left++;
                 } else {
                     right--;
                 }
             }
         }
         return count;
     }
 }
