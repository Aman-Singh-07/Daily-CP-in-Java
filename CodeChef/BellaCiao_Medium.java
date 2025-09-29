// https://www.codechef.com/problems/CHFHEIST

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
		StringBuilder res=new StringBuilder();
		while(t-->0)
		{
		    long D=input.nextInt(), d=input.nextInt(), P=input.nextInt(), Q=input.nextInt(), q=D/d, r=D%d;
		    res.append(D*P + q*(q-1)/2*Q*d  + r*q*Q +"\n");
		}
		System.out.print(res);

	}
}
