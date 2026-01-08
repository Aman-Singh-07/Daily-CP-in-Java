// https://www.codechef.com/problems/CHEFLUCK?tab=statement

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
		  while(n>=0){
		      if(n%7==0){
		          break;
		      }
		      n-=4;
		  }
		  System.out.println((n%7==0)?n:-1);
		}

	}
}
