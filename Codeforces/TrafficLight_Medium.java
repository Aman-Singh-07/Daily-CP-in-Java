// https://codeforces.com/problemset/problem/1744/C 

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            char c = input.next().charAt(0);
            String s = input.next();
            String doubled = s + s;
            int res = 0;
            int idx = -1;
            for (int i = 2 * n - 1; i >= 0; i--) {
                if (doubled.charAt(i) == 'g') {
                    idx = i;
                }
                if (i < n && doubled.charAt(i) == c && idx != -1) {
                    res = Math.max(res, idx - i);
                }
            }

            System.out.println(res);
        }
    }
}
