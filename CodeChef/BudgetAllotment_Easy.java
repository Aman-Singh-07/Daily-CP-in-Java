// https://www.codechef.com/problems/BUDGET25?tab=ide

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
		    int count=0;
		    long sum=0;
		    int[] arr=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=input.nextInt();
		        if(arr[i]>=x){
		            sum+=(long) arr[i]-x;
		            count++;
		        }
		    }
		    Arrays.sort(arr);
		    for(int i=n-1;i>=0;i--){
		        if(arr[i]<x && sum>0){
		            long need=(long) x-arr[i];
		            if(sum>=need){
		                count++;
		                sum-=need;
		            }
		            else break;
		            
		        }
		    }
		    System.out.println(count);
		}

	}
}
