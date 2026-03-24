// https://www.codechef.com/problems/DELXORONE?tab=statement

import java.util.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t--> 0) {
            int n = input.nextInt();
            HashMap < Integer, Integer > map = new HashMap < > ();
            for (int i = 0; i < n; i++) {
                int x = input.nextInt();
                map.put(x, map.getOrDefault(x, 0) + 1);
            }
            int maxKept = 0;
            for (int x: map.keySet()) {
                maxKept = Math.max(maxKept, map.get(x));
                if (x % 2 == 0) {
                    int combined = map.get(x) + map.getOrDefault(x + 1, 0);
                    maxKept = Math.max(maxKept, combined);
                } else {
                    int combined = map.get(x) + map.getOrDefault(x - 1, 0);
                    maxKept = Math.max(maxKept, combined);
                }
            }
            System.out.println(n - maxKept);
        }
    }
}
