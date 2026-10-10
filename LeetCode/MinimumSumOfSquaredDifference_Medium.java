// https://leetcode.com/problems/minimum-sum-of-squared-difference/description/?envType=daily-question&envId=2026-10-10

class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        int max = 0;
        int[] diff = new int[n];
        
        for (int i = 0; i < n; i++) {
            diff[i] = Math.abs(nums1[i] - nums2[i]);
            if (diff[i] > max) max = diff[i];
        }
        
        int[] b = new int[max + 1];
        for (int d : diff) {
            b[d]++;
        }
        
        long z = (long) k1 + k2;
        
        for (int d = max; d > 0; d--) {
            if (b[d] == 0) continue;
            
            if (z >= b[d]) {
                z -= b[d];
                b[d - 1] += b[d];
                b[d] = 0;
            } else {
                b[d - 1] += (int) z;
                b[d] -= (int) z;
                z = 0;
                break;
            }
        }
        
        long res = 0;
        for (long d = 1; d <= max; d++) {
            if (b[(int) d] > 0) {
                res += b[(int) d] * (d * d);
            }
        }
        
        return res;
    }
}
