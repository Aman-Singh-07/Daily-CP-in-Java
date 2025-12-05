// https://codeforces.com/problemset/problem/1520/D

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
            }

            Map<Integer, Long> freq = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int key = arr[i] - i;  // important transformation
                freq.put(key, freq.getOrDefault(key, 0L) + 1);
            }

            long count = 0;
            for (long f : freq.values()) {
                count += f * (f - 1) / 2;  // choose 2 from f
            }

            System.out.println(count);
        }
    }
}
