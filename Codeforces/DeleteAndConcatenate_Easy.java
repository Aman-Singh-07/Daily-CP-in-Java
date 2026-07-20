// https://codeforces.com/contest/2245/problem/B

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner fs = new Scanner(System.in);
        int t = fs.nextInt();
        while(t-- > 0){
            int n = fs.nextInt();
            long c = fs.nextLong();
            long[] a = new long[n];
            int p = 0;
            for(int i = 0; i<n; i++){
                a[i] = fs.nextLong()-c;
                if(a[i] > 0){
                    p++;
                }
            }
            Arrays.sort(a);
            int m = (n+1)/2;
            int k = Math.max(m, p);
            long ans = 0;
            for(int i = n-1; i>=n-k; i--){
                ans += a[i];
            }
            System.out.println(ans);
        }
    }
}
