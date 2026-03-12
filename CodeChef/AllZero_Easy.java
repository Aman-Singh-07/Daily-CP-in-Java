// https://www.codechef.com/problems/ALLZR

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
		    int a=input.nextInt();
		    int b=input.nextInt();
		    int c=input.nextInt();
		    b=b-2*a;
		    a=0;
		    c=c-3*b;
		    b=0;
		    System.out.println(c==0?"Yes":"No");
		}

	}
}
