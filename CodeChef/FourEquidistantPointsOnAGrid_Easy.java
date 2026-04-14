// https://www.codechef.com/problems/DISTCON

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
		if(t%2!=0) System.out.println(-1);
		else{
		    int d=t/2;
		    System.out.println(d + " 0");
            System.out.println(-d + " 0");
            System.out.println("0 " + d);
            System.out.println("0 " + -d);
		}

	}
}
