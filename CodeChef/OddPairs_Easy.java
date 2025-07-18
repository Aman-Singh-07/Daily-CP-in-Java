// https://www.codechef.com/problems/ODDPAIRS?tab=statement

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
		    long r=(n%2==0)?n/2:(n+1)/2;
		    System.out.println(r*(n-r)*2);
		}

	}
}
