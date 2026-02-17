// https://www.codechef.com/problems/CHEFODD?tab=statement

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
		    long k=input.nextLong();
		    long odd=(n+1)/2;
		    long r=odd-k;
		    if(r<0 || r%2!=0 || k*2>n) System.out.println("NO");
		    else System.out.println("YES");
		    
		}

	}
}
