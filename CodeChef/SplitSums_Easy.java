// https://www.codechef.com/problems/SPSUM

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
		    long m=input.nextLong();
		    long sum=(n*(n+1)/2);
		    if(sum==m && m==1) System.out.println("Yes");
		    else if(sum<=m) System.out.println("No");
		    else{
		        long diff=sum-m;
		        if(diff%2==0){
		            if(gcd(diff/2,m+(diff/2))==1) System.out.println("Yes");
		            else System.out.println("No");
		        }
		        else System.out.println("No");
		    }
		}

	}
	public static long gcd(long a,long b){
	    if(b==0) return a;
	    return gcd(b,a%b);
	}
}
