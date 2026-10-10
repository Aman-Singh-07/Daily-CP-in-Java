// https://codeforces.com/contest/1593/problem/B

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        while (x--> 0) {
            long n = input.nextLong();
            String s = String.valueOf(n);
            int res = Integer.MAX_VALUE;
            for (int j = s.length() - 1; j >= 0; j--) {
                char jv = s.charAt(j);
                for (int i = 0; i < j; i++) {
                    char iv = s.charAt(i);
                    if (jv == '0') {
                        if (iv == '5' || iv == '0') {
                            res = Math.min(s.length() - 2 - i, res);
                        }
                    }
                    if (jv == '5') {
                        if (iv == '2' || iv == '7') {
                            res = Math.min(s.length() - 2 - i, res);
                        }
                    }
                }
            }
            System.out.println(res);
        }
    }
}
