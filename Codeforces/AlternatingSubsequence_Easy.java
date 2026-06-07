// https://codeforces.com/problemset/problem/1343/C

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
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
		    }
		    int min=Integer.MIN_VALUE;
		    int max=Integer.MIN_VALUE;
		    for(int i=0;i<n;i++){
		        if(arr[i]<0){
		            if(max!=Integer.MIN_VALUE){
		                sum+=max;
		                max=Integer.MIN_VALUE;
		            }
		            min=Math.max(min,arr[i]);
		        }else{
		            if(min!=Integer.MIN_VALUE){
		                sum+=min;
		                min=Integer.MIN_VALUE;
		            }
		            max=Math.max(max,arr[i]);
		        }
		    }
		    if(min!=Integer.MIN_VALUE) sum+=min;
		    if(max!=Integer.MIN_VALUE) sum+=max;
		    System.out.println(sum);
		}

	}
}
