// https://codeforces.com/problemset/problem/1360/D

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            long n = input.nextLong();
            long k = input.nextLong();
            long ans = n; 
            for (long d = 1; d * d <= n; d++) {
                if (n % d == 0) {
                    if (d <= k) {
                        ans = Math.min(ans, n / d);
                    }
                    long other = n / d;
                    if (other <= k) {
                        ans = Math.min(ans, d);
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
