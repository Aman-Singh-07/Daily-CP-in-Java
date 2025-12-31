// https://codeforces.com/problemset/problem/2182/A

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            String s = input.next();

            int result;
            if (s.contains("2026")) {
                result = 0;
            } else if (!s.contains("2025")) {
                result = 0;
            } else {
                result = 1;
            }

            System.out.println(result);
        }
    }
}
