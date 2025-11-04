// https://www.codechef.com/problems/CHEFA

import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextLong();
            }
            // your code goes here
            Arrays.sort(a);
            long sum=0;
            for(int i=n-1;i>=0;i-=2){
                sum+=a[i];
            }
            System.out.println(sum);
        }
    }
}
