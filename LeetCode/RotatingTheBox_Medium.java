// https://leetcode.com/problems/rotating-the-box/?envType=daily-question&envId=2026-05-06

class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        int m = boxGrid.length;
        int n = boxGrid[0].length;
        for (int i = 0; i < m; i++) {
            int emptyPos = n - 1; 
            for (int j = n - 1; j >= 0; j--) {
                if (boxGrid[i][j] == '*') {
                    emptyPos = j - 1;
                } else if (boxGrid[i][j] == '#') {
                    char temp = boxGrid[i][j];
                    boxGrid[i][j] = boxGrid[i][emptyPos];
                    boxGrid[i][emptyPos] = temp;
                    emptyPos--;
                }
            }
        }
        char[][] rotatedGrid = new char[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                rotatedGrid[j][m - 1 - i] = boxGrid[i][j];
            }
        }

        return rotatedGrid;
    }
}
