// https://codeforces.com/contest/1399/problem/B

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            long[] a=new long[n];
            long[] b=new long[n];
            long min1=Long.MAX_VALUE;
            long min2=Long.MAX_VALUE;
            for(int i=0;i<n;i++){
                a[i]=input.nextLong();
                if(a[i]<min1) min1=a[i];
            }
            for(int i=0;i<n;i++){
                b[i]=input.nextLong();
                if(b[i]<min2) min2=b[i];
            }
            long sum=0;
            for(int i=0;i<n;i++){
                long max1=a[i]-min1;
                long max2=b[i]-min2;
                sum+=Math.max(max1,max2);
            }
            System.out.println(sum);
            
        }
    }
}
