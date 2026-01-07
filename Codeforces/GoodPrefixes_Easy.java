// https://codeforces.com/problemset/problem/1985/C

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextLong();
            }

            long sum = 0;
            long max = Long.MIN_VALUE;
            int count = 0;

            for (int i = 0; i < n; i++) {
                sum += arr[i];
                max = Math.max(max, arr[i]);
                if (sum - max == max) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
