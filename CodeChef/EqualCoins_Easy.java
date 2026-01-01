// https://www.codechef.com/problems/EQUALCOIN?tab=statement

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
		    long x=input.nextInt();
		    long y=input.nextInt();
		    System.out.println(((x+2*y)%2!=0 || (y%2!=0 && x<2))?"NO":"YES");
		}

	}
}
