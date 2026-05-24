// https://www.codechef.com/problems/TWONUMBERS?tab=statement

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static long gcd(long a, long b) {
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public static long lcm(long a, long b) {
        return (a/gcd(a,b))*b;
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            long n=input.nextLong();
            if(n==2){
                System.out.println(0);
                continue;
            }
            if(n%2==1){
                long a=n/2;
                long b=n/2+1;
                System.out.println(lcm(a,b)-gcd(a,b));
            } 
            else{
                long mid=n/2;
                if(mid%2==0){
                    long a=mid-1;
                    long b=mid+1;
                    System.out.println(lcm(a,b)-gcd(a,b));
                } 
                else{
                    long a=mid-2;
                    long b=mid+2;
                    System.out.println(lcm(a,b)-gcd(a,b));
                }
            }
        }
    }
}
