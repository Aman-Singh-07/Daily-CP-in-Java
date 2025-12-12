// https://www.codechef.com/problems/TRICOIN

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
		    int count=0;
		    int sum=0;
		    int i=1;
		    while(i<=n){
		        count++;
		        n-=i;
		        i++;
		    }
		    System.out.println(count);
		}

	}
}
