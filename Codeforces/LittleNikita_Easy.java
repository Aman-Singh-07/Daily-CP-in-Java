// https://codeforces.com/problemset/problem/1977/A

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int m = input.nextInt();
            System.out.println((n >= m && (n - m) % 2 == 0) ? "Yes" : "No");
        }
    }
}
