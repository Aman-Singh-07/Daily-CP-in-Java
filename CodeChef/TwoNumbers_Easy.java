// https://www.codechef.com/problems/TWONMS

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
		    long n=input.nextLong();
		    if(n%2==1){
		        a=a*2;
		    }
		    System.out.println(Math.max(a,b)/Math.min(a,b));
		}

	}
}
