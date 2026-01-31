// https://codeforces.com/problemset/problem/2187/A

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        if (input.hasNextInt()) {
            int t = input.nextInt();
            while (t-- > 0) {
                int n = input.nextInt();
                long[] a = new long[n]; 
                long[] b = new long[n];
                for (int i = 0; i < n; i++) {
                    a[i] = input.nextLong();
                    b[i] = a[i];
                }
                Arrays.sort(b);
                boolean sorted = true;
                for (int i = 0; i < n; i++) {
                    if (a[i] != b[i]) {
                        sorted = false;
                        break;
                    }
                }
                if (sorted) {
                    System.out.println(-1);
                    continue;
                }
                long minVal=b[0];
                long maxVal=b[n - 1];
                long ans = Long.MAX_VALUE;
                for (int i = 0; i < n; i++) {
                    if (a[i] != b[i]) {
                        long diffWithMin = Math.abs(a[i] - minVal);
                        long diffWithMax = Math.abs(a[i] - maxVal);
                        long res = Math.max(diffWithMin, diffWithMax);
                        ans = Math.min(ans, res);
                    }
                }
                System.out.println(ans);
            }
        }
    }
}
