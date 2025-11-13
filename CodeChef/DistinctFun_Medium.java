// https://www.codechef.com/problems/P7BAR?tab=ide

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt(); 
        while (t-- > 0) {
            int n = input.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = input.nextInt();
            }

            int count = 1;
            HashSet<Integer> set = new HashSet<>();
            for (int x : a) {
                if (set.contains(x)) {
                    count++;
                    set.clear();
                }
                set.add(x);
            }

            System.out.println(count - 1);
        }
    }
}
