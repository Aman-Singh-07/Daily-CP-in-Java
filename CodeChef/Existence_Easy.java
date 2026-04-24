// https://www.codechef.com/problems/EXISTENCE

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
		    long x=input.nextLong();
		    long y=input.nextLong();
		    if((x*x*x*x+(4*y*y))==(4*y*x*x)) System.out.println("YES");
		    else System.out.println("NO");
		}

	}
}
