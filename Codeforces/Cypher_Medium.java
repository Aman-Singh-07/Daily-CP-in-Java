// https://codeforces.com/problemset/problem/1703/C

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = input.nextInt();
            }
            for (int i = 0; i < n; i++) {
                int b = input.nextInt();
                String moves = input.next();
                int digit = a[i];
                for (char c : moves.toCharArray()) {
                    if (c == 'U') {
                        digit = (digit - 1 + 10) % 10;
                    } else if (c == 'D') {
                        digit = (digit + 1) % 10;
                    }
                }
                System.out.print(digit + " ");
            }
            System.out.println();
        }
    }
}
