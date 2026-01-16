// https://codeforces.com/problemset/problem/459/B

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        long[] arr = new long[n];

        long countMax = 0;
        long countMin = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextLong();
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }

        for (long num : arr) {
            if (num == max) countMax++;
            if (num == min) countMin++;
        }

        if (max == min) {
            System.out.println("0 " + ((long) n * (n - 1) / 2));
        } else {
            System.out.println((max - min) + " " + countMax * countMin);
        }
    }
}
