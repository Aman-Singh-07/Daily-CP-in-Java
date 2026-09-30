// https://codeforces.com/contest/2269/problem/B

import java.util.*;

public class Main {

    public static long next(long n) {
        long sum = 0;
        while (n > 0) {
            long d = n % 10;
            sum += d * d;
            n /= 10;
        }
        return sum;
    }

    public static long get(long n) {
        for (int i = 0; i < 100; i++) {
            n = next(n);
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int t = fs.nextInt();
        while (t-- > 0) {
            int n = fs.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = get(fs.nextLong());
            }
            long res = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (a[i] == a[j]) {
                        res++;
                    }
                }
            }
            System.out.println(res);
        }
    }
}
