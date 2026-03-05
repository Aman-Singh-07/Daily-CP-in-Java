// https://www.codechef.com/problems/REDONE?tab=statement

import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input=new Scanner(System.in);
		long MOD=1000000007L;
        int MAX_N=1000001;
        long[] fact=new long[MAX_N+1];
        fact[1]=1; 
        for(int i=2;i<=MAX_N;i++){
            fact[i]=(fact[i-1]*i)%MOD;
        }
		int t=input.nextInt();
		while(t-->0){
		    int n=input.nextInt();
		    long res=(fact[n+1]-1+MOD) % MOD;
		    System.out.println(res);
		    
		}

	}
}
