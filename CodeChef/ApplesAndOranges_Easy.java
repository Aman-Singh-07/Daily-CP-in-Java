// https://www.codechef.com/problems/APPLEORANGE?tab=statement

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
		    System.out.println(gcd(a,b));
		    
		}

	}
	public static long gcd(long a,long b){
	    if(b==0) return a;
	    return gcd(b,a%b);
	}
}
