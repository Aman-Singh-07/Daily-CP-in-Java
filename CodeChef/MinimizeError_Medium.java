// https://www.codechef.com/problems/MNERROR?tab=statement

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
		    long m=input.nextLong();
		    long temp1=n;
		    long temp2=m;
		    long res=find1(temp1,temp2);
		    long guess=find2(res,temp2);
		    System.out.println(guessRes(guess));
		}

	}
	public static long find1(long n,long m){
	    return m+n;
	}
	public static long find2(long res,long m){
	    return (res/(m+1));
	}
	public static long guessRes(long guess){
	    return guess/2;
	}
}
