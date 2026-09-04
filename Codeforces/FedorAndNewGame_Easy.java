// https://codeforces.com/contest/467/problem/B

import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();
        int k = input.nextInt();

        int[] x = new int[m + 1];

        for (int i = 0; i <= m; i++) {
            x[i] = input.nextInt();
        }

        int count = 0;
        for (int i = 0; i < m; i++) {
            int XOR = x[i] ^ x[m];
            if (Integer.bitCount(XOR) <= k) {
                count++;
            }
        }

        System.out.println(count);
    }
}
