// https://codeforces.com/contest/2229/problem/B

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());

            int[] a = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }

            long sumMax = 0;
            int maxMin = 0;
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                int b = Integer.parseInt(st.nextToken());
                sumMax += Math.max(a[i], b);
                maxMin = Math.max(maxMin, Math.min(a[i], b));
            }

            System.out.println(sumMax + maxMin);
        }
    }
}
