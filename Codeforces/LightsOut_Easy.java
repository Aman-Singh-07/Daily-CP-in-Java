// https://codeforces.com/contest/275/problem/A

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] a = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int x = a[i][j];
                
                if (i > 0) x += a[i - 1][j];
                if (i < 2) x += a[i + 1][j];
                if (j > 0) x += a[i][j - 1];
                if (j < 2) x += a[i][j + 1];

                if (x % 2 == 0) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
}
