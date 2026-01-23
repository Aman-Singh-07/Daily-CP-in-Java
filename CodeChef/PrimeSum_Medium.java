// https://www.codechef.com/problems/PRIMESM?tab=statement

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
		    long a=input.nextLong();
		    long b=input.nextLong();
		    if(a==1 || b==1) System.out.println(-1);
		    else if(gcd(a,b)>1) System.out.println("0");
		    else System.out.println("1");
		    
		}

	}
	public static long gcd(long a, long b){
	    if(b==0) return a;
	    return gcd(b,a%b);
	}
}
