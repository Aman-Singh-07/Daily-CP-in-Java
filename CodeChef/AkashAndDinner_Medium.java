// https://www.codechef.com/problems/CHEFDINE?tab=statement

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t--> 0) {
            int n = input.nextInt();
            int k = input.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = input.nextInt();
            }
            int[] b = new int[n];
            for (int j = 0; j < n; j++) {
                b[j] = input.nextInt();
            }
            HashMap < Integer, Integer > has = new HashMap < > ();
            for (int i = 0; i < n; i++) {
                if (has.containsKey(a[i])) {
                    if (b[i] < has.get(a[i])) {
                        has.put(a[i], b[i]);
                    }
                } else {
                    has.put(a[i], b[i]);
                }
            }
            if (has.size() < k) {
                System.out.println(-1);
            } else {
                long tot = 0;
                ArrayList < Integer > sorArr = new ArrayList < > ();
                for (Map.Entry < Integer, Integer > map: has.entrySet()) {
                    sorArr.add(map.getValue());
                }
                Collections.sort(sorArr);
                for (int i = 0; i < k; i++) {
                    tot += sorArr.get(i);
                }
                System.out.println(tot);
            }
        }
    }
}
