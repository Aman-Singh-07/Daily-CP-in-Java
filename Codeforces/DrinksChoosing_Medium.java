// https://codeforces.com/contest/1195/problem/A

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        if (!input.hasNextInt()) return;

        int n = input.nextInt();
        int k = input.nextInt();

        int[] freq = new int[k + 1];

        for (int i = 0; i < n; i++) {
            int x = input.nextInt();
            freq[x]++;
        }

        int pairs = 0;
        int singles = 0;

        for (int i = 1; i <= k; i++) {
            pairs += freq[i] / 2;
            singles += freq[i] % 2;
        }

        int count = (n + 1) / 2 - pairs;

        int res = pairs * 2 + Math.min(count, singles);

        System.out.println(res);
    }
}
