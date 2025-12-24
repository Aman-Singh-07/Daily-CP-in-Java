// https://www.codechef.com/problems/TEMPBAL

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
		    long[] arr=new long[n];
		    for(int i=0;i<n;i++) arr[i]=input.nextLong();
		    long count=0;
		    for(int i=0;i<n-1;i++){
		        if(arr[i]!=0){
		            arr[i+1]+=arr[i];
		            count+=Math.abs(arr[i]);
		            arr[i]=0;
		        }
		    }
		    System.out.println(count);
		}

	}
}
