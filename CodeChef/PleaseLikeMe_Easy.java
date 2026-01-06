// https://www.codechef.com/problems/PLZLYKME?tab=statement

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
		long l=input.nextLong();
		long d=input.nextLong();
		long s=input.nextLong();
		long c=input.nextLong();
		if(s>=l){
		    System.out.println("ALIVE AND KICKING");
		    continue;
		}
		long sum=s;
		while(d-->1){
		    sum=sum+c*sum;
		    if(sum>=l) break;
		}
		if(sum<l) System.out.println("DEAD AND ROTTING");
		else System.out.println("ALIVE AND KICKING");
		}

	}
}
