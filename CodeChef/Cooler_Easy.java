// https://www.codechef.com/problems/COOLER7

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
		    long sum=0;
		    while(n!=m){
		        sum+=n;
		        n--;
		    }
		    System.out.println(sum);
		}

	}
}
