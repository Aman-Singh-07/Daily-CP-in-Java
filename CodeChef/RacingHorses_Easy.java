// https://www.codechef.com/problems/HORSES

import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            long[] s = new long[n];
            for (int i = 0; i < n; i++) {
                s[i] = scanner.nextLong();
            }
            // your code goes here
            Arrays.sort(s);
            long min=Long.MAX_VALUE;
            for(int i=1;i<n;i++){
                min=Math.min(min,Math.abs(s[i]-s[i-1]));
            }
            System.out.println(min);
        }
    }
}
