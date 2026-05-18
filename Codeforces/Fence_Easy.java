// https://codeforces.com/problemset/problem/363/B

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int k=input.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) arr[i]=input.nextInt();
		long sum=0;
		for(int i=0;i<k;i++) sum+=arr[i];
		long res=sum;
		int idx=0;
		for(int i=1;i<=n-k;i++){
		    sum+=arr[k+i-1]-arr[i-1];
		    if(sum<res){
		        res=sum;
		        idx=i;
		        
		    }
		}
		System.out.println(idx+1);
		

	}
}

