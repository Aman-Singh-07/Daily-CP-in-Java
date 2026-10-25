// https://codeforces.com/contest/1914/problem/D

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

        // Write your solution here

        int n = fs.nextInt();

        int[] a1 = new int[n];
        for (int i = 0; i < n; i++) {
            a1[i] = fs.nextInt();
        }
        int[] a2 = new int[n];
        for (int i = 0; i < n; i++) {
            a2[i] = fs.nextInt();
        }
        int[] a3 = new int[n];
        for (int i = 0; i < n; i++) {
            a3[i] = fs.nextInt();
        }
        int[] b1 = new int[3];
        int[] b2 = new int[3];
        int[] b3 = new int[3];
        int m1=-1;
        int m2=-1;
        int m3=-1;

        if (a1[0] >= a1[1] && a1[1] >= a1[2]) {
            m1 = 0;
            m2 = 1;
            m3 = 2;
        } else if (a1[0] >= a1[2] && a1[2] >= a1[1]) {
            m1 = 0;
            m2 = 2;
            m3 = 1;
        } else if (a1[1] >= a1[0] && a1[0] >= a1[2]) {
            m1 = 1;
            m2 = 0;
            m3 = 2;
        } else if (a1[1] >= a1[2] && a1[2] >= a1[0]) {
            m1 = 1;
            m2 = 2;
            m3 = 0;
        } else if (a1[2] >= a1[0] && a1[0] >= a1[1]) {
            m1 = 2;
            m2 = 0;
            m3 = 1;
        } else {
            m1 = 2;
            m2 = 1;
            m3 = 0;
        }

        for (int i = 3; i < n; i++) {
            if (a1[i] >= a1[m1]) {
                m3 = m2;
                m2 = m1;
                m1 = i;
            }
            else if (a1[i] >= a1[m2]) {
                m3 = m2;
                m2 = i;
            }
            else if (a1[i] > a1[m3]) {
                m3 = i;
            }
        }
        b1[0] = m1;
        b1[1] = m2;
        b1[2] = m3;
        if (a2[0] >= a2[1] && a2[1] >= a2[2]) {
            m1 = 0;
            m2 = 1;
            m3 = 2;
        } else if (a2[0] >= a2[2] && a2[2] >= a2[1]) {
            m1 = 0;
            m2 = 2;
            m3 = 1;
        } else if (a2[1] >= a2[0] && a2[0] >= a2[2]) {
            m1 = 1;
            m2 = 0;
            m3 = 2;
        } else if (a2[1] >= a2[2] && a2[2] >= a2[0]) {
            m1 = 1;
            m2 = 2;
            m3 = 0;
        } else if (a2[2] >= a2[0] && a2[0] >= a2[1]) {
            m1 = 2;
            m2 = 0;
            m3 = 1;
        } else {
            m1 = 2;
            m2 = 1;
            m3 = 0;
        }
        for (int i = 3; i < n; i++) {
            if (a2[i] >= a2[m1]) {
                m3 = m2;
                m2 = m1;
                m1 = i;
            }
            else if (a2[i] >= a2[m2]) {
                m3 = m2;
                m2 = i;
            }
            else if (a2[i] > a2[m3]) {
                m3 = i;
            }
        }
        b2[0] = m1;
        b2[1] = m2;
        b2[2] = m3;
        if (a3[0] >= a3[1] && a3[1] >= a3[2]) {
            m1 = 0;
            m2 = 1;
            m3 = 2;
        } else if (a3[0] >= a3[2] && a3[2] >= a3[1]) {
            m1 = 0;
            m2 = 2;
            m3 = 1;
        } else if (a3[1] >= a3[0] && a3[0] >= a3[2]) {
            m1 = 1;
            m2 = 0;
            m3 = 2;
        } else if (a3[1] >= a3[2] && a3[2] >= a3[0]) {
            m1 = 1;
            m2 = 2;
            m3 = 0;
        } else if (a3[2] >= a3[0] && a3[0] >= a3[1]) {
            m1 = 2;
            m2 = 0;
            m3 = 1;
        } else {
            m1 = 2;
            m2 = 1;
            m3 = 0;
        }
        for (int i = 3; i < n; i++) {
            if (a3[i] >= a3[m1]) {
                m3 = m2;
                m2 = m1;
                m1 = i;
            }
            else if (a3[i] >= a3[m2]) {
                m3 = m2;
                m2 = i;
            }
            else if (a3[i] > a3[m3]) {
                m3 = i;
            }
        }
        b3[0] = m1;
        b3[1] = m2;
        b3[2] = m3;

        int max = 0;
        for (int num1: b1) {
            for (int num2: b2) {
                if (num1 != num2) {
                    for (int num3: b3) {
                        if (num1 != num3 && num3 != num2) {
                            max = Math.max(max, a1[num1] + a2[num2] + a3[num3]);
                        }
                    }
                }
            }
        }




        out.println(max);

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
