// https://codeforces.com/problemset/problem/2182/B

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            long n = input.nextLong();
            long m = input.nextLong();
            long a = n, b = m;
            int count1 = 0;
            long size = 1;
            boolean whiteTurn = true;
            while (true) {
                if (whiteTurn) {
                    if (a < size) break;
                    a -= size;
                } else {
                    if (b < size) break;
                    b -= size;
                }
                count1++;
                size *= 2;
                whiteTurn = !whiteTurn;
            }
            a = n; b = m;
            int count2 = 0;
            size = 1;
            boolean darkTurn = true;
            while (true) {
                if (darkTurn) {
                    if (b < size) break;
                    b -= size;
                } else {
                    if (a < size) break;
                    a -= size;
                }
                count2++;
                size *= 2;
                darkTurn = !darkTurn;
            }
            System.out.println(Math.max(count1, count2));
        }
    }
}
