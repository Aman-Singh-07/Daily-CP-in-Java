// https://codeforces.com/problemset/problem/2257/B

import java.util.*;
import java.lang.*;
import java.io.*;

public class Solution
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		while(t-->0){
		    int n=input.nextInt();
		    int m=input.nextInt();
		    int[] arr=new int[n];
		    int[] brr=new int[m];
		    int sum1=0;
		    int sum2=0;
		    for(int i=0;i<n;i++){
		        arr[i]=input.nextInt();
		    }
		    for(int i=0;i<m;i++){
		        brr[i]=input.nextInt();
		    }
		    for(int i=1;i<n;i++){
		        sum1+=(arr[i-1]-arr[i]+1);
		    }
		    for(int i=1;i<m;i++){
		        sum2+=(brr[i-1]-brr[i]+1);
		    }
		    sum1+=arr[n-1];
		    sum2+=brr[m-1];
		    if(sum1>=sum2){
		        System.out.println("1");
		    }else{
		        System.out.println("2");
		    }
		    
		}

	}
}
