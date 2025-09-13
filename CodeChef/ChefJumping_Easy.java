// https://www.codechef.com/problems/OJUMPS?tab=statement

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input=new Scanner(System.in);
		long n=input.nextLong();
		if (n%6==0 || n%6==1 || n%6==3) System.out.println("yes");
		else System.out.println("no");


	}
}
