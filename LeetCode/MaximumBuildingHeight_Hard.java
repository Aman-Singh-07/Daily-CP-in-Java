// https://leetcode.com/problems/maximum-building-height/?envType=daily-question&envId=2026-06-20

import java.util.Arrays;

class Solution {
    public int maxBuilding(int n, int[][] restrictions) {
        int m = restrictions.length;
        int[][] res = new int[m + 2][2];
        
        for (int i = 0; i < m; i++) {
            res[i] = restrictions[i];
        }
        res[m] = new int[]{1, 0};
        res[m + 1] = new int[]{n, n - 1};
        
        Arrays.sort(res, (a, b) -> Integer.compare(a[0], b[0]));
        
        int len = res.length;
        
        for (int i = 1; i < len; i++) {
            int dist = res[i][0] - res[i-1][0];
            res[i][1] = Math.min(res[i][1], res[i-1][1] + dist);
        }
        
        for (int i = len - 2; i >= 0; i--) {
            int dist = res[i+1][0] - res[i][0];
            res[i][1] = Math.min(res[i][1], res[i+1][1] + dist);
        }
        
        int maxHeight = 0;
        for (int i = 1; i < len; i++) {
            int id1 = res[i-1][0], h1 = res[i-1][1];
            int id2 = res[i][0], h2 = res[i][1];
            
            int peak = (h1 + h2 + id2 - id1) / 2;
            maxHeight = Math.max(maxHeight, peak);
        }
        
        return maxHeight;
    }
}
