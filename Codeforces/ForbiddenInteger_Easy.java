// https://codeforces.com/problemset/problem/1845/A

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int k = input.nextInt();
            int x = input.nextInt();
            if (x != 1) {
                System.out.println("YES");
                System.out.println(n);
                for (int i = 0; i < n; i++) {
                    System.out.print("1 ");
                }
                System.out.println();
            } 
            else {
                if (k == 1 || (k == 2 && n % 2 != 0)) {
                    System.out.println("NO");
                } 
                else {
                    System.out.println("YES");
                    if (n % 2 == 0) {
                        System.out.println(n / 2);
                        for (int i = 0; i < n / 2; i++) {
                            System.out.print("2 ");
                        }
                        System.out.println();
                    } else {
                        System.out.println(n / 2); 
                        System.out.print("3 ");
                        for (int i = 0; i < (n - 3) / 2; i++) {
                            System.out.print("2 ");
                        }
                        System.out.println();
                    }
                }
            }
        }
    }
}
