// https://codeforces.com/contest/2196/problem/B

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
            }
            long count = 0;
            for (int i = 0; i < n; i++) {
                long val = arr[i];
                long limit = val * val;
                if (limit > n) limit = n;
                for (int j = (int) val; j <= limit; j += (int) val) {
                    int forwardIdx = i + j;
                    if (forwardIdx < n) {
                        if (val * arr[forwardIdx] == j) {
                            count++;
                        }
                    }
                    int backwardIdx = i - j;
                    if (backwardIdx >= 0) {
                        if (val * arr[backwardIdx] == j) {
                            if (arr[i] != arr[backwardIdx]) {
                                count++;
                            }
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }
}
