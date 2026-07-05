// https://codeforces.com/contest/2237/problem/B


import java.io.*;
import java.util.*;

public class Solution {
    // Fast I/O Template
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }

    static FastReader sc = new FastReader();

    public static void solve() {
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        
        TreeSet<Long> set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            set.add(sc.nextLong());
        }

        long[] c = new long[n];
        for (int i = 0; i < n; i++) {
            Long val = set.ceiling(a[i]);
            if (val == null) {
                System.out.println(-1);
                return;
            }
            c[i] = val;
            set.remove(val);
        }
        
        long ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (c[i] > c[j]) ans++;
            }
        }
        
        System.out.println(ans);
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }
    }
}
