// https://www.codechef.com/problems/FIZZBUZZ2305?tab=statement

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
		    if(n%2==0 || n==1) System.out.println("Bob");
		    else System.out.println("Alice");
		    
		}

	}
}
