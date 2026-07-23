// https://codeforces.com/contest/371/problem/C

import java.io.*;
import java.util.*;

public class Main {

    static FastScanner fs = new FastScanner();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws Exception {

        int t = 1;

        // Uncomment for multiple test cases
        // t = fs.nextInt();

        while (t--> 0) {
            solve();
        }

        out.flush();
        out.close();
    }

    static void solve() {

        // Write your solution here

        String S = fs.next();
        long a = 0, b = 0, c = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'B') a++;
            else if (S.charAt(i) == 'S') b++;
            else c++;
        }
        long b1 = fs.nextLong(), b2 = fs.nextInt(), b3 = fs.nextInt();
        long p1 = fs.nextInt(), p2 = fs.nextInt(), p3 = fs.nextInt();
        long r = fs.nextLong();
        long low = 0, high = r + 100;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            long r1 = Math.max(a * mid - b1, 0);
            long r2 = Math.max(b * mid - b2, 0);
            long r3 = Math.max(c * mid - b3, 0);
            long price = r1 * p1 + r2 * p2 + r3 * p3;
            if (price <= r) low = mid + 1;
            else high = mid - 1;
        }
        System.out.println(high);

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
