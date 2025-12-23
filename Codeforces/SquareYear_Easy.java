// https://codeforces.com/problemset/problem/2114/A

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            String s = input.next();
            int n = Integer.parseInt(s);
            int sqrt = (int) Math.sqrt(n);
            if (sqrt * sqrt != n) {
                System.out.println(-1);
                continue;
            }
            System.out.println(sqrt+" "+0);
        }
    }
}
