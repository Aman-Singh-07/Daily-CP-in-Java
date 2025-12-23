// https://www.codechef.com/problems/MINSM

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		while(t-->0){
		    int n=input.nextInt();
		    long[] arr=new long[n];
		    for(int i=0;i<n;i++) arr[i]=input.nextLong();
		    long gcdMin=arr[0];
		    for(int i=0;i<n;i++){
		        gcdMin=gcd(gcdMin,arr[i]);
		    }
		    System.out.println(n*gcdMin);
		    
		}

	}
	
	public static long gcd(long a,long b){
	    if(b==0) return a;
	    return gcd(b,a%b);
	}
}
