// https://codeforces.com/problemset/problem/1853/A

import java.util.*;

public class Desorting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt(); 
        while (t-- > 0) {
            int n = input.nextInt(); 
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = input.nextInt();
            }

            if (!isSorted(a)) {
                System.out.println(0);
            } else {
                int minDiff = Integer.MAX_VALUE;
                for (int i = 0; i < n - 1; i++) {
                    minDiff = Math.min(minDiff, a[i + 1] - a[i]);
                }
                System.out.println((minDiff / 2) + 1);
            }
        }
    }
    public static boolean isSorted(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
