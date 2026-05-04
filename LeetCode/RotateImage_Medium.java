// https://leetcode.com/problems/rotate-image/description/?envType=daily-question&envId=2026-05-04

class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int k = 0; k < n; k++) {
            int i = 0, j = n - 1;
            while (i < j) {  
                int temp = matrix[k][i];
                matrix[k][i] = matrix[k][j];
                matrix[k][j] = temp;
                i++;
                j--;
            }
        }
    }
}
