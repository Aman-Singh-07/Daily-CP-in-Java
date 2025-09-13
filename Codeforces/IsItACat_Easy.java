// https://codeforces.com/problemset/problem/1800/A

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            String s = input.next().toLowerCase();

            // Compress consecutive duplicates
            StringBuilder sb = new StringBuilder();
            sb.append(s.charAt(0));
            for (int i = 1; i < n; i++) {
                if (s.charAt(i) != s.charAt(i - 1)) {
                    sb.append(s.charAt(i));
                }
            }

            if (sb.toString().equals("meow")) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
