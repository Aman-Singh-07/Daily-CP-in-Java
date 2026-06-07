// https://www.codechef.com/problems/ADMINSHOP?tab=statement

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
		    int k=input.nextInt();
		    int count=0;
		    int min=Integer.MAX_VALUE;
		    for(int i=0;i<n;i++){
		        int x=input.nextInt();
		        min=Math.min(min,x);
		    }
		    System.out.println(Math.max(n,(min+k-1)/min));
		}

	}
}
