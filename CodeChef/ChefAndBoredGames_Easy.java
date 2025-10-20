// https://www.codechef.com/problems/PCJ18B?tab=statement

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
		    long sum=0;
		    for(int i=0;i<=n;i+=2){
		        sum+=(n-i)*(n-i);
		    }
		    System.out.println(sum);
		}

	}
}
