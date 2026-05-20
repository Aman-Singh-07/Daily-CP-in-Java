// https://codeforces.com/contest/2230/problem/A

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		while(t-->0){
		    long n=input.nextLong();
		    long a=input.nextLong();
		    long b=input.nextLong();
		    long res=0;
		    if(n>2){
		        res+=Math.min((n/3)*a*3,(n/3)*b);
		        n=n%3;
		        res+=Math.min(n*a,b);
		        System.out.println(res);
		    }else{
		        System.out.println(Math.min(n*a,b));
		    }
		    
		}

	}
}
