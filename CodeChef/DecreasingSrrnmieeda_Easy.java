// https://www.codechef.com/problems/DECREM?tab=statement

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
		    long l=input.nextLong();
		    long r=input.nextLong();
		    if(l*2<=r) System.out.println(-1);
		    else System.out.println(r);
		}

	}
}
