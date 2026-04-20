// https://www.codechef.com/problems/AIRHOCKEY

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
		    int m=input.nextInt();
		    int max=Math.max(n,m);
		    if(max>=7) System.out.println(0);
		    else System.out.println(7-max);
		}

	}
}
