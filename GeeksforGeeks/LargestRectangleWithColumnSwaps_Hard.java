// https://www.geeksforgeeks.org/problems/find-the-largest-rectangle-of-1s-with-swapping-of-columns-allowed0243/1

class Solution {
    public int maxArea(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[][] hist = new int[n][m];
        for (int j = 0; j < m; j++) {
            hist[0][j] = mat[0][j];
            for (int i = 1; i < n; i++) {
                hist[i][j] = (mat[i][j] == 1) ? hist[i - 1][j] + 1 : 0;
            }
        }

        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int[] count = new int[m];
            for (int j = 0; j < m; j++) {
                count[j] = hist[i][j];
            }
            Arrays.sort(count);
            for (int j = m - 1; j >= 0; j--) {
                int height = count[j];
                int width = m - j;
                int currentArea = height * width;

                maxArea = Math.max(maxArea, currentArea);
            }
        }

        return maxArea;
    }
}
