//  https://www.codechef.com/problems/MAXAGRY?tab=statement

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		while(t-->0){
		    long n=input.nextLong();
		    long k=input.nextLong();
		    k=Math.min(k,n/2);
		    long res=(2*k*(n-((k+1))))+k;
		    System.out.println(res);
		}
	}
}
