// https://www.codechef.com/problems/FCTRL

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
		    long count=0;
		    long divisor=5;
		    while(n/divisor>0){
		        count+=n/divisor;
		        divisor*=5;
		    }
		    System.out.println(count);
		}

	}
}
