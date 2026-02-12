// https://codeforces.com/problemset/problem/2197/A

import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            long x=input.nextLong();
            System.out.println(solve(x));
        }
    }
    public static int solve(long x){
        if(x%9!=0) return 0;
        long low=0,high=2000000000L;
        while(low<=high){
            long mid=low+(high-low)/2;
            long val=mid-digitSum(mid);
            if(val==x) return 10;
            if(val<x) low=mid+1;
            else high=mid-1;
        }
        return 0;
    }
    public static long digitSum(long n){
        long sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}
