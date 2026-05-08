// https://www.codechef.com/problems/MAXISUM

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        
        while (t-- > 0) {
            int n = input.nextInt();
            long k = input.nextLong();
            long[] arr = new long[n];
            long[] brr = new long[n];

            for (int i = 0; i < n; i++) arr[i] = input.nextLong();
            for (int i = 0; i < n; i++) brr[i] = input.nextLong();

            int bestIdx = 0;
            long maxAbsB = -1;

            for (int i = 0; i < n; i++) {
                long absB = Math.abs(brr[i]);
                if (absB > maxAbsB) {
                    maxAbsB = absB;
                    bestIdx = i;
                }
            }

            if (brr[bestIdx] > 0) {
                arr[bestIdx] += k;
            } else {
                arr[bestIdx] -= k;
            }

            long total = 0;
            for (int i = 0; i < n; i++) {
                total += (arr[i] * brr[i]);
            }

            System.out.println(total);
        }
    }
}
