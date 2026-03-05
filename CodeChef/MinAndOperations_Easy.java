// https://www.codechef.com/problems/BOP3?tab=statement

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
		    long n=input.nextLong();
		    System.out.println(solve(n));
		    
		}

	}
	public static long solve(long n){
	    return (n*n)/4+(n/2);
	}
}
