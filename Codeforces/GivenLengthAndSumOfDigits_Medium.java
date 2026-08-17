// https://codeforces.com/contest/489/problem/C

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int m = fs.nextInt();
        int s = fs.nextInt();
        if ((s == 0 && m > 1) || s > 9 * m) {
            System.out.println("-1 -1");
            return;
        }
        if (m == 1 && s == 0) {
            System.out.println("0 0");
            return;
        }
        StringBuilder max = new StringBuilder();
        int sum = s;
        for (int i = 0; i < m; i++) {
            int digit = Math.min(9, sum);
            max.append(digit);
            sum -= digit;
        }
        sum = s;
        int[] min = new int[m];
        sum--;
        for (int i = m - 1; i > 0; i--) {
            min[i] = Math.min(9,sum);
            sum -= min[i];
        }
        min[0] = sum + 1;
        StringBuilder smallest=new StringBuilder();
        for (int d:min){
            smallest.append(d);
        }
        System.out.println(smallest + " " + max);
    }
}
