// https://www.geeksforgeeks.org/problems/dominant-pairs/1

class Solution {
	public int dominantPairs(int[] arr) {
		// Code here
		int count = 0;
		int n = arr.length;
		Arrays.sort(arr, 0, n/2);
		Arrays.sort(arr, n/2, n);
		int left = 0, right = n/2;
		while (left<n/2 && right<n) {
			if (arr[left] >= 5*arr[right]) {
				count += n/2 - left;
				right++;
			}
			else
				left++;
		}
		return count;
	}
}
