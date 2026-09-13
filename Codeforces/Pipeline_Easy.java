// https://codeforces.com/contest/287/problem/B

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long k=sc.nextLong();
        long max=(k-1)*k/2+1;
        if (max<n){
            System.out.println(-1);
            return;
        }
        if (n==1){
            System.out.println(0);
            return;
        }
        int l=2;
        int r=(int)k;
        while (l<=r){
            int mid=l+(r-l)/2;
            long s=sum(mid,k);
            if (s==n){
                System.out.println(k-mid+1);
                return;
            }
            else if (s>n)l=mid+1;
            else r=mid-1;
        }
        System.out.println(k-l+2);
    }
    public static long sum(long mid,long k){
        return (k-mid+1)*(mid+k)/2 - (k-mid+1) +1;
    }
}
