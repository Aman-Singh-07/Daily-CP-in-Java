// https://www.codechef.com/problems/FLAGS?tab=statement

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
		    long num1=n*(n-1)*(n-1)*2;
		    long num2=n*(n-1)*(n-2);
		    long num3=n*(n-1)*(n-2)*(n-2)*2;
		    System.out.println(num1+num2+num3);
		}

	}
}
