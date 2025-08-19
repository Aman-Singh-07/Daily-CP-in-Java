// https://codeforces.com/problemset/problem/2131/C

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            long k = input.nextLong();

            long[] s = new long[n];
            long[] u = new long[n];
            for (int i = 0; i < n; i++) {
                s[i] = input.nextLong();
            }
            for (int i = 0; i < n; i++) {
                u[i] = input.nextLong();
            }
            HashMap<Long, Long> mp = new HashMap<>();

            for (long val : s) {
                long rem = val % k;
                long key = Math.min(rem, k - rem);
                mp.put(key, mp.getOrDefault(key, 0L) + 1);
            }
            for (long val : u) {
                long rem = val % k;
                long key = Math.min(rem, k - rem);
                mp.put(key, mp.getOrDefault(key, 0L) - 1);
            }

            boolean isTrue = true;
            for (long count : mp.values()) {
                if (count != 0) {
                    isTrue = false;
                    break;
                }
            }
            if (isTrue) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
