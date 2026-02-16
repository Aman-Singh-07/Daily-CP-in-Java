// https://codeforces.com/problemset/problem/2194/B

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            long x = input.nextLong();
            long y = input.nextLong();
            long res = 0;
            long maxBonus = -1;
            for (int i = 0; i < n; i++) {
                long ai = input.nextLong();
                long fullTransfers = ai / x;
                long remainder = ai % x;
                res += (fullTransfers * y);
                long currentBonus = remainder + (fullTransfers * (x - y));
                if (currentBonus > maxBonus) {
                    maxBonus = currentBonus;
                }
            }
            System.out.println(res + maxBonus);
        }
    }
}
