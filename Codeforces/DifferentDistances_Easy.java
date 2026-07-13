// https://codeforces.com/contest/2233/problem/B

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            StringBuilder sb = new StringBuilder();
            if (n % 2 == 0) {
                for (int i = 1; i <= n; i++) sb.append(i).append(" ");
                for (int i = n; i >= 1; i--) sb.append(i).append(" ");
                for (int i = n; i >= 1; i--) sb.append(i).append(" ");
                for (int i = 1; i <= n; i++) sb.append(i).append(" ");
                
            } else {
                for (int i = 1; i <= n; i++) sb.append(i).append(" ");
                sb.append(n).append(" ");
                for (int i = 1; i < n; i++) sb.append(i).append(" ");
                sb.append(1).append(" ");
                for (int i = n; i >= 2; i--) sb.append(i).append(" ");
                for (int i = n; i >= 1; i--) sb.append(i).append(" ");
            }
            System.out.println(sb.toString().trim());
        }
    }
}
