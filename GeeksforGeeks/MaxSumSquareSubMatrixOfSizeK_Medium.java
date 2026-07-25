// https://www.geeksforgeeks.org/problems/coins-of-geekland--141631/1

class Solution {
	public int maximumSum(int[][] mat, int k) {
		// code here
		int n=mat.length;
		int mx = Integer.MIN_VALUE;
		int d[][] = new int[n + 1][n + 1];
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				if (i == 0 || j == 0) {
					d[i][j] = 0;
				} else {
					d[i][j] = mat[i - 1][j - 1]+d[i - 1][j]+d[i][j - 1]-d[i - 1][j - 1];
				}
				if (i >= k && j >= k) {
					mx = Math.max(d[i][j]-(d[i][j - k]+d[i - k][j]-d[i - k][j - k]), mx);
				}
			}
		}
		return mx;
	}
}

