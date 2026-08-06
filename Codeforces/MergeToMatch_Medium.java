// https://codeforces.com/contest/2248/problem/B

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner fs=new Scanner(System.in);
        int t=fs.nextInt();
        while(t-->0){
            int n=fs.nextInt();
            int m=fs.nextInt();
            int[] a=new int[n];
            int[] b=new int[m];
            for(int i=0;i<n;i++) a[i]=fs.nextInt();
            for(int i=0;i<m;i++) b[i]=fs.nextInt();
            Arrays.sort(a);
            Arrays.sort(b);
            if(n<2*m){
                System.out.println("NO");
                continue;
            }
            int i=0;
            while(i<m && a[i]<b[i] && b[i]<a[n-m+i]) i++;

            System.out.println(i<m?"NO":"YES");
        }
    }
}
