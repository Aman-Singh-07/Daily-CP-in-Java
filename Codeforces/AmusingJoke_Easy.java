// https://codeforces.com/problemset/problem/141/A

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String x = input.next();
        String y = input.next();
        char[] z = input.next().toCharArray();
        char[] temp = (x + y).toCharArray();

        Arrays.sort(z);
        Arrays.sort(temp);

        boolean flag = true;
        if (z.length != temp.length) {
            flag = false;
        } else {
            for (int i = 0; i < z.length; i++) {
                if (temp[i] != z[i]) {
                    flag = false;
                    break;
                }
            }
        }

        if (flag)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
