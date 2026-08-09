// https://codeforces.com/contest/2254/problem/A

import java.util.Scanner;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int[] a = new int[3];
            a[0] = input.nextInt();
            a[1] = input.nextInt();
            a[2] = input.nextInt();
            Arrays.sort(a);
            int diff1 = a[1] - a[0];
            int diff2 = a[2] - a[1];
            int diff3 = a[2] - a[0];
            int min = Math.min(diff1, diff2);
            min = Math.min(min, diff3);
            System.out.println(min);

        }
    }
}
