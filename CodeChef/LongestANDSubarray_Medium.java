//  https://www.codechef.com/problems/ANDSUBAR?tab=statement

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
		    long n=input.nextLong();
		    if(n==1) System.out.println("1");
		    else{
		        long p2=Long.highestOneBit(n);
		        long res1=n-p2+1;
		        long res2=p2/2;
		        System.out.println(Math.max(res1,res2));
		    }
		}

	}
}
