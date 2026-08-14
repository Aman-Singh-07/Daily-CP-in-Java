// https://codeforces.com/problemset/problem/1395/A

import java.io.*;
import java.util.*;

public class Main {

    static FastScanner fs = new FastScanner();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws Exception {

        int t = 1;

        // Uncomment for multiple test cases
        t = fs.nextInt();

        while (t--> 0) {
            solve();
        }

        out.flush();
        out.close();
    }

    static void solve() {
        long r = fs.nextLong();
        long g = fs.nextLong();
        long b = fs.nextLong();
        long w = fs.nextLong();

        if (check(r, g, b, w)) {
            out.println("Yes");
            return;
        }

        if (r > 0 && g > 0 && b > 0) {
            if (check(r - 1, g - 1, b - 1, w + 3)) {
                out.println("Yes");
                return;
            }
        }

        out.println("No");
    }

    static boolean check(long r, long g, long b, long w) {
        int oddCount = 0;
        if (r % 2 != 0) oddCount++;
        if (g % 2 != 0) oddCount++;
        if (b % 2 != 0) oddCount++;
        if (w % 2 != 0) oddCount++;

        return oddCount <= 1;
    }


    /* ================= Utility Methods ================= */

    static long gcd(long a, long b) {
        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    static long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }

    static long power(long a, long b) {
        long result = 1;

        while (b > 0) {
            if ((b & 1) == 1) {
                result *= a;
            }

            a *= a;
            b >>= 1;
        }

        return result;
    }

    static long modPower(long a, long b, long mod) {
        long result = 1;

        a %= mod;

        while (b > 0) {
            if ((b & 1) == 1) {
                result = (result * a) % mod;
            }

            a = (a * a) % mod;
            b >>= 1;
        }

        return result;
    }

    static void sort(int[] arr) {
        ArrayList < Integer > list = new ArrayList < > ();

        for (int x: arr) {
            list.add(x);
        }

        Collections.sort(list);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
    }

    static void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
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

                try {
                    len = in.read(buffer);
                } catch (IOException e) {
                    return -1;
                }

                if (len <= 0) {
                    return -1;
                }
            }

            return buffer[ptr++];
        }

        int nextInt() {
            int c;

            while ((c = read()) <= ' ') {
                if (c == -1) {
                    return -1;
                }
            }

            int sign = 1;

            if (c == '-') {
                sign = -1;
                c = read();
            }

            int val = 0;

            while (c > ' ') {
                val = val * 10 + (c - '0');
                c = read();
            }

            return val * sign;
        }

        long nextLong() {
            int c;

            while ((c = read()) <= ' ') {
                if (c == -1) {
                    return -1;
                }
            }

            int sign = 1;

            if (c == '-') {
                sign = -1;
                c = read();
            }

            long val = 0;

            while (c > ' ') {
                val = val * 10 + (c - '0');
                c = read();
            }

            return val * sign;
        }

        String next() {
            int c;

            while ((c = read()) <= ' ') {
                if (c == -1) {
                    return null;
                }
            }

            StringBuilder sb = new StringBuilder();

            while (c > ' ') {
                sb.append((char) c);
                c = read();
            }

            return sb.toString();
        }
    }
}
