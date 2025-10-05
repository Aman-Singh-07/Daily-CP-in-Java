// https://www.codechef.com/problems/DIRECTN

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
		   String s=input.next();
		   if(s.contains("RR") || s.contains("LL")) System.out.println("YES");
		   else System.out.println("NO");
		}

	}
}
