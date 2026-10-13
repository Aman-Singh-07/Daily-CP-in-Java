// https://codeforces.com/problemset/problem/2274/B

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int t = fs.nextInt();
        while (t-- > 0) {
            int n = fs.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = fs.nextLong();
            }
            long maxAns = arr[0];
            long maxS = arr[0];
            long minS = arr[0];
            
            for (int i = 1; i < n; i++) {
                long currentVal = arr[i];
                long option1 = currentVal - minS;
                long option2 = currentVal;
                long option3 = currentVal + maxS;
                long currentMaxElement = Math.max(option1, Math.max(option2, option3));
                maxAns = Math.max(maxAns, currentMaxElement);
                long nextMaxS = Math.max(currentVal, Math.max(maxS + currentVal, 2 * maxS + currentVal));
                long nextMinS = Math.min(currentVal, Math.min(minS + currentVal, 2 * minS + currentVal));
                maxS = nextMaxS;
                minS = nextMinS;
            }
            
            System.out.println(maxAns);
        }
    }
}
