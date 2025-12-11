// https://codeforces.com/problemset/problem/1363/A

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int x = input.nextInt();
            int odd = 0, even = 0;
            for (int i = 0; i < n; i++) {
                int num = input.nextInt();
                if (num % 2 == 0) even++;
                else odd++;
            }
            if (odd == 0) {
                System.out.println("No");
            } else if (x == n) {
                System.out.println(odd % 2 == 1 ? "Yes" : "No");
            } else {
                if (x % 2 == 1) {
                    System.out.println("Yes");
                } else {
                    System.out.println(even > 0 ? "Yes" : "No");
                }
            }
        }
    }
}
