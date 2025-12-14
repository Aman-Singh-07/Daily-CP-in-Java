// https://codeforces.com/problemset/problem/1985/D

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int m = input.nextInt();
            char[][] grid = new char[n][m];
            int minRow = n, maxRow = -1;
            int minCol = m, maxCol = -1;
            for (int i = 0; i < n; i++) {
                String row = input.next();
                for (int j = 0; j < m; j++) {
                    grid[i][j] = row.charAt(j);
                    if (grid[i][j] == '#') {
                        minRow = Math.min(minRow, i);
                        maxRow = Math.max(maxRow, i);
                        minCol = Math.min(minCol, j);
                        maxCol = Math.max(maxCol, j);
                    }
                }
            }
            int centerRow=(minRow + maxRow) / 2 + 1;
            int centerCol=(minCol + maxCol) / 2 + 1;

            System.out.println(centerRow + " " + centerCol);
        }
    }
}
