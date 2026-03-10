// https://www.codechef.com/problems/CLMBSTRS?tab=statement

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    static final int MAX=1000000;
    static final long MOD=1000000007;
    static long[] fib = new long[MAX+2];
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		fib[0]=0;
        fib[1]=1;
        for(int i=2;i<=MAX+1;i++){
            fib[i]=(fib[i-1]+fib[i-2])%MOD;
        }
		while(t-->0){
		    int n=input.nextInt();
		    int m=input.nextInt();
		    int res=Long.bitCount(fib[n+1]);
		    if(res==m) System.out.println("CORRECT");
		    else System.out.println("INCORRECT");
		}

	}
}
