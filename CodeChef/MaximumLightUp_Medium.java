// https://www.codechef.com/problems/DIWALI1?tab=statement

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
		    long p=input.nextLong();
		    long a=input.nextLong();
		    long b=input.nextLong();
		    long c=input.nextLong();
		    long x=input.nextLong();
		    long y=input.nextLong();
		    if (((x*a)+b)<((y*a)+c)) System.out.println(p/((x*a)+b));
            else System.out.println(p/((y*a)+c));
		    
		}

	}
}
