// https://codeforces.com/problemset/problem/2160/B

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int[] a=new int[n];
            long[] b=new long[n];
            for(int i=0;i<n;i++){
                b[i]=input.nextLong();
            }
            a[0]=1;
            for(int i=1;i<n;i++){
                a[i]=(b[i]-b[i-1]==i+1)?i+1:a[(int) (i-b[i]+b[i-1])];
            }
            for(int i=0;i<n;i++){
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
    }
}
