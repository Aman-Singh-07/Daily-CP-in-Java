// https://www.codechef.com/problems/ALEXTASK

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
		    long min=Long.MAX_VALUE;
		    for(int i=0;i<n;i++){
		        for(int j=i+1;j<n;j++){
		            min=Math.min(min,((arr[i]*arr[j])/gcd(arr[i],arr[j])));
		        }
		    }
		    System.out.println(min);
		    
		}

	}
	public static long gcd(long a,long b){
	    if(b==0) return a;
	    return gcd(b,a%b);
	}
}
