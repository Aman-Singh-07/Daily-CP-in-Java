// https://codeforces.com/contest/2231/problem/B

import java.util.*;
import java.lang.*;
import java.io.*;

public class Code
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		while(t-->0){
			int n=input.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<n;i++) arr[i]=input.nextInt();
			int k=0;
			for(int i=0;i<n-1;i++){
			    if(arr[i]>arr[i+1]) k=Math.max(k,arr[i]-arr[i+1]);
			}
			int i=0;
			while(i<n-1){
			    if(arr[i]>arr[i+1]) arr[i+1]+=k;
			    i++;
			}
			i=0;
			boolean isTrue=true;
			while(i<n-1){
			    if(arr[i]>arr[i+1]){
			        isTrue=false;
			        break;
			    }
			    i++;
			}
			System.out.println(isTrue?"Yes":"No");

			
		}

	}
}
