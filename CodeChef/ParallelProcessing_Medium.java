// https://www.codechef.com/problems/PLPROCESS

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
		    int[] arr=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=input.nextInt();
		        sum+=arr[i];
		    }
		    long min=sum;
		    long s=0;
		    for(int i=0;i<n;i++){
		        s+=arr[i];
		        long max=Math.max(s,sum-s);
		        min=Math.min(max,min);
		    }
		    System.out.println(min);
		}

	}
}
