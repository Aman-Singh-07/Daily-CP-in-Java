// https://leetcode.com/problems/check-if-it-is-a-straight-line/description/

class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int x0 = coordinates[0][0], y0 = coordinates[0][1];
        int x1 = coordinates[1][0], y1 = coordinates[1][1];
        for (int i = 2; i < coordinates.length; i++) {
            int x = coordinates[i][0], y = coordinates[i][1];
            if ((y1 - y0) * (x - x1) != (y - y1) * (x1 - x0)) {
                return false;
            }
        }
        return true;
    }
}
