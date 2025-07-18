// https://www.codechef.com/problems/JUMPAB?tab=statement

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
		    int a=input.nextInt();
		    int b=input.nextInt();
		    int diff=m-b*n;
		    int steps=a-b;
		    if(diff%steps==0){
		        int x=diff/steps;
		        if(x>=0 && x<=n) System.out.println("Yes");
		        else System.out.println("No");
		    }
		    else System.out.println("No");
		}

	}
}
