// https://www.codechef.com/problems/CTRCH?tab=statement

import java.io.*;
import java.util.*;

class CodeChef {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        
        while (t-- > 0) {
            int n = input.nextInt();
            int d = input.nextInt();
            
            long[][] days = new long[n][3];
            for (int i = 0; i < n; i++) {
                days[i][0] = input.nextLong();
                days[i][1] = input.nextLong();
                days[i][2] = input.nextLong();
            }
            
            Arrays.sort(days, (a, b) -> Long.compare(a[0], b[0]));
            
            PriorityQueue<long[]> pq = new PriorityQueue<>((a, b) -> Long.compare(b[2], a[2]));
            
            int j = 0;
            
            for (int i = 1; i <= d; i++) {
                while (j < n && days[j][0] <= i) {
                    pq.offer(days[j]);
                    j++;
                }
                
                if (!pq.isEmpty()) {
                    long temp[] = pq.poll();
                    temp[1]--;
                    if (temp[1] > 0) {
                        pq.offer(temp);
                    }
                }
            }
            
            long ans = 0;
            while (!pq.isEmpty()) {
                long[] temp = pq.poll();
                ans += temp[2] * temp[1];
            }
            
            for (int k = j; k < n; k++) {
                ans += days[k][2] * days[k][1];
            }
            
            System.out.println(ans);
        }
    }
}
