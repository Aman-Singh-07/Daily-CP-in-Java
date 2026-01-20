// https://codeforces.com/problemset/problem/2191/B

import java.util.Scanner;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int count0 = 0;
            int count1 = 0;
            for (int i = 0; i < n; i++) {
                int val = input.nextInt();
                if (val == 0) count0++;
                if (val == 1) count1++;
            }
            if (count0 == 0) {
                System.out.println("NO");
            }
            else if (count0 >= 2 && count1 == 0) {
                System.out.println("NO");
            }
            else {
                System.out.println("YES");
            }
        }
    }
}
