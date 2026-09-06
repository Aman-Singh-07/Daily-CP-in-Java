// https://www.codechef.com/problems/MISMO?tab=statement

import java.io.*;
import java.util.*;

public class Main {

    static FastScanner fs = new FastScanner();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws Exception {
        int t = 1;
        while (t-- > 0) {
            solve();
        }
        out.flush();
        out.close();
    }

    static void solve() {
        int n = fs.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = fs.nextInt();
        }
        long[][] dp = new long[n][n];
        int[] pref = new int[n + 1];
        for (int i = 0; i < n; i++) {
            pref[i + 1] = pref[i] + arr[i];
        }

        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                dp[i][j] = Long.MAX_VALUE;
                for (int k = i; k < j; k++) {
                    long leftColor = (pref[k + 1] - pref[i]) % 100;
                    long rightColor = (pref[j + 1] - pref[k + 1]) % 100;
                    long smoke = dp[i][k] + dp[k + 1][j] + (leftColor * rightColor);

                    dp[i][j] = Math.min(dp[i][j], smoke);
                }
            }
        }

        out.println(dp[0][n - 1]);
    }

    /* ================= Fast Scanner ================= */
    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0;
        private int len = 0;

        private int read() {
            if (ptr >= len) {
                ptr = 0;
                try { len = in.read(buffer); } catch (IOException e) { return -1; }
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }

        int nextInt() {
            int c;
            while ((c = read()) <= ' ') { if (c == -1) return -1; }
            int sign = 1;
            if (c == '-') { sign = -1; c = read(); }
            int val = 0;
            while (c > ' ') { val = val * 10 + (c - '0'); c = read(); }
            return val * sign;
        }
    }
}
