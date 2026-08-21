// https://codeforces.com/contest/2253/problem/B

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int t=fs.nextInt();
        while (t-- > 0) {
            int n = fs.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = fs.nextInt();
            }
            ArrayList<Integer> color = new ArrayList<>();
            ArrayList<Integer> len = new ArrayList<>();
            for (int i = 0; i < n; ) {
                int j = i;
                while (j < n && a[j] == a[i]) {
                    j++;
                }
                color.add(a[i]);
                len.add(j - i);
                i = j;
            }
            int m = color.size();
            int answer = m;
            for (int i = 0; i + 1 < m; i++) {
                int gain = 0;
                if (len.get(i) >= 2) {
                    gain++;
                }
                if (len.get(i + 1) >= 2) {
                    gain++;
                }
                if (len.get(i) == 1 && i > 0 && color.get(i - 1).equals(color.get(i + 1))) {
                    gain--;
                }
                if (len.get(i + 1) == 1 && i + 2 < m && color.get(i + 2).equals(color.get(i))) {
                    gain--;
                }
                answer = Math.max(answer, m + gain);
            }
            answer = Math.min(answer, n);

            System.out.println(answer);
        }
    }
}

