// https://codeforces.com/problemset/problem/1360/A

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int a = input.nextInt();
            int b = input.nextInt();
            int side = Math.max(2 * Math.min(a, b), Math.max(a, b));
            System.out.println(side * side);
        }
    }
}
