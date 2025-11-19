// https://www.codechef.com/problems/ICM2008?tab=statement

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
		    int d=input.nextInt();
		    if(a==b) System.out.println("YES");
		    else if(c==d) System.out.println("NO");
		    else System.out.println((Math.abs(a-b))%Math.abs(c-d)==0?"YES":"NO");
		}

	}
}
