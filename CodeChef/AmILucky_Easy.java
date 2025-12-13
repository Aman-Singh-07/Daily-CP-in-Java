// https://www.codechef.com/problems/SPCP4

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
		    int n=input.nextInt();
		    int x=input.nextInt();
		    int y=n-x;
		    int k=input.nextInt();
		    int a=x%k;
		    int b=y%k;
		    int z=Math.min(a,b);
		    a-=z;
		    b-=z;
		    System.out.println(Math.max(a,b));
		}

	}
}
