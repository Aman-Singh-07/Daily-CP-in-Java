// https://codeforces.com/problemset/problem/1352/B

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        while (t-- > 0) {
            int n = input.nextInt();
            int k = input.nextInt();

            int rem1 = n - (k - 1);
            if (rem1 > 0 && rem1 % 2 != 0) {
                System.out.println("YES");
                for (int i = 0; i < k - 1; i++) System.out.print("1 ");
                System.out.println(rem1);
                continue;
            }

            int rem2 = n - 2 * (k - 1);
            if (rem2 > 0 && rem2 % 2 == 0) {
                System.out.println("YES");
                for (int i = 0; i < k - 1; i++) System.out.print("2 ");
                System.out.println(rem2);
                continue;
            }

            System.out.println("NO");
        }
    }
}
