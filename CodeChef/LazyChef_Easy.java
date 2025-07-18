// https://www.codechef.com/problems/LAZYCHF

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
		    int x=input.nextInt();
		    int m=input.nextInt();
		    int d=input.nextInt();
		    System.out.println(Math.min(x*m,x+d));
		}

	}
}
