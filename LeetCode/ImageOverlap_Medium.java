// https://leetcode.com/problems/image-overlap/description/?envType=daily-question&envId=2026-09-13

class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n = img1.length;
        ArrayList<int[]> A = new ArrayList<>();
        ArrayList<int[]> B = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (img1[i][j] == 1) A.add(new int[]{i, j});
                if (img2[i][j] == 1) B.add(new int[]{i, j});
            }
        }
        int[][] res = new int[2 * n][2 * n];
        int best = 0;
        for (int[] a : A) {
            for (int[] b : B) {
                int dx = b[0] - a[0] + n;
                int dy = b[1] - a[1] + n;
                best = Math.max(best, ++res[dx][dy]);
            }
        }
        return best;
    }
}
