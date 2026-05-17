// https://codeforces.com/problemset/problem/455/A

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int max=0;
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=input.nextInt();
		    max=Math.max(arr[i],max);
		}
		long[] freq=new long[max+1];
		for(int i=0;i<n;i++){
		    freq[arr[i]]++;
		}
		if(max==1){
		    System.out.println(freq[1]);
		    return;
		}
		long[] dp=new long[max+1];
		dp[0]=0;
		dp[1]=freq[1];
		for(int i=2;i<=max;i++){
		    dp[i]=Math.max(dp[i-1],dp[i-2]+i*freq[i]);
		}
		System.out.println(dp[max]);
	}
}
