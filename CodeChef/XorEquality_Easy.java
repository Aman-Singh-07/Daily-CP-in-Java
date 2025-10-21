// https://www.codechef.com/problems/XOREQUAL?tab=statement

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    static long mod = 1000000007;
    public static void main (String[] args) throws java.lang.Exception {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            System.out.println(power(2,n-1));
        }
    }
    public static long power(long base,long exp){
        long result=1;
        base=base%mod;
        while(exp>0){
            if((exp & 1)==1)
                result=(result*base)%mod;
            base=(base*base)%mod;
            exp>>=1;
        }
        return result;
    }
}
