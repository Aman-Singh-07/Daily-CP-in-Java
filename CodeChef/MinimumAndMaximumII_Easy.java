// https://www.codechef.com/problems/MINANDMAX2?tab=statement

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
		    System.out.println((n*(n+1)/2)+(n-1));
		}

	}
}
