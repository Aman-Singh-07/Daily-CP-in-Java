// https://www.codechef.com/problems/ARREQU?tab=ide

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            long[] arr = new long[n];
            Map<Long, Integer> freq = new HashMap<>();
            int maxFreq = 0;

            for (int i = 0; i < n; i++) {
                arr[i] = input.nextLong();
                freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
                maxFreq = Math.max(maxFreq, freq.get(arr[i]));
            }

            System.out.println(maxFreq <= (n + 1) / 2 ? "Yes" : "No");
        }
    }
}
