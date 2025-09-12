// https://www.codechef.com/problems/S02E10

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
		    int x=input.nextInt();
		    int k=input.nextInt();
		    int[] a=new int[n];
		    int[] b=new int[n];
		    for(int i=0;i<n;i++){
		        a[i]=input.nextInt();
		    }
		    for(int i=0;i<n;i++){
		        b[i]=input.nextInt();
		    }
		    int count=0;
		    for(int i=0;i<n;i++){
		        if(Math.abs(a[i]-b[i])<=k){
		            count++;
		        }
		    }
		    System.out.println(count>=x?"YES":"NO");
		}

	}
}
