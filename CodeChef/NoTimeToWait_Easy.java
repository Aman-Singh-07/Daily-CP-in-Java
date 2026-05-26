// https://www.codechef.com/problems/NOTIME

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int m=input.nextInt();
		int k=input.nextInt();
		int max=0;
		for(int i=0;i<n;i++){
		    int x=input.nextInt();
		    max=Math.max(max,x);
		}
		System.out.println((max+k)>=m?"YES":"NO");

	}
}
