// https://codeforces.com/problemset/problem/1807/D

import java.util.*;
import java.lang.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t--> 0) {
            int n = input.nextInt();
            int q = input.nextInt();
            long[] pref = new long[n + 1];
            for (int i = 1; i <= n; i++) {
                long val = input.nextLong();
                pref[i] = pref[i - 1] + val;
            }
            long totalSum = pref[n];
            while (q--> 0) {
                int l = input.nextInt();
                int r = input.nextInt();
                long k = input.nextLong();
                long originalRangeSum = pref[r] - pref[l - 1];

                long newRangeSum = (long)(r - l + 1) * k;

                long newTotalSum = totalSum - originalRangeSum + newRangeSum;

                if (newTotalSum % 2 != 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
