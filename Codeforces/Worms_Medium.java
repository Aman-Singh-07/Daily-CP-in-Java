// https://codeforces.com/problemset/problem/474/B

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        int[] prefix = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
            prefix[i] = (i == 0) ? arr[i] : prefix[i - 1] + arr[i];
        }

        int m = input.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = input.nextInt();
        }

        for (int j = 0; j < m; j++) {
            int label = arr2[j];
            int low = 0, high = n - 1, ans = -1;

            while (low <= high) {
                int mid = (low + high) / 2;
                if (label <= prefix[mid]) {
                    ans = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            System.out.println(ans + 1); 
        }
    }
}
