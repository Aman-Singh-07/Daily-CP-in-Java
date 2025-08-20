// https://codeforces.com/problemset/problem/1579/A

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            String s = input.next();
            int a = 0, b = 0, c = 0;
            for (char ch : s.toCharArray()) {
                if (ch == 'A') a++;
                else if (ch == 'B') b++;
                else if (ch == 'C') c++;
            }
            System.out.println((b == a + c) ? "YES" : "NO");
        }
    }
}
