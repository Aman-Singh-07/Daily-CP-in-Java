// https://www.geeksforgeeks.org/problems/coverage-of-all-zeros-in-a-binary-matrix4024/1

class Solution {
	public int findCoverage(int[][] mat) {
		// code here
		int count = 0;
		for (int i = 0; i<mat.length; i++) {
			for (int j = 0; j<mat[0].length; j++) {
				if (mat[i][j] == 0) {
					int l = -1;
					int r = -1;
					int u = -1;
					int d = -1;
					for (int k = j + 1; k<mat[0].length; k++) {
						if (mat[i][k] == 1) {
							r = 0;
							break;
						}
					}
					for (int k = j - 1; k >= 0; k--) {
						if (mat[i][k] == 1) {
							l = 0;
							break;
						}
					}
					for (int k = i + 1; k<mat.length; k++) {
						if (mat[k][j] == 1) {
							d = 0;
							break;
						}
					}
					for (int k = i - 1; k >= 0; k--) {
						if (mat[k][j] == 1) {
							u = 0;
							break;
						}
					}
					if (l == 0)
						count++;
					if (r == 0)
						count++;
					if (d == 0)
						count++;
					if (u == 0)
						count++;
				}
			}
		}
		return count;
	}
}
