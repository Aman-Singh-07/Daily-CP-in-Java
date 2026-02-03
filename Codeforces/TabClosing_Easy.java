// https://codeforces.com/contest/2166/problem/B

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            long a = input.nextLong();
            long b = input.nextLong();
            long n = input.nextLong();

            System.out.println(solve(a, b, n));
        }
    }

    public static long solve(long a, long b, long n) {
        if(a/n<b && b!=a) return 2;
        return 1;
    }
}
