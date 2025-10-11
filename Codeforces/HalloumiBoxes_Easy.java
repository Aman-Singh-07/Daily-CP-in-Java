// https://codeforces.com/problemset/problem/1903/A

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int k = input.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
            }

            if (k > 1) {
                System.out.println("YES");
            } else {
                boolean sorted = true;
                for (int i = 1; i < n; i++) {
                    if (arr[i - 1] > arr[i]) {
                        sorted = false;
                        break;
                    }
                }
                System.out.println(sorted ? "YES" : "NO");
            }
        }
    }
}
