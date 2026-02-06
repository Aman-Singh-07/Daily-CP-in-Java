// https://www.codechef.com/problems/XOR_ORDER?tab=statement

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            long a=input.nextLong();
            long b=input.nextLong();
            long c=input.nextLong();
            long diffAB=Long.highestOneBit(a ^ b);
            long diffBC=Long.highestOneBit(b ^ c);
            if(diffAB==diffBC){
                System.out.println(-1);
            }else{
                long x=0;
                if((a&diffAB)!=0){
                    x|=diffAB;
                }
                if((b&diffBC)!=0){
                    x|=diffBC;
                }
                System.out.println(x);
            }
        }
    }
}
